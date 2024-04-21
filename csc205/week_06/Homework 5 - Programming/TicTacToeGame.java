// Tyler J. Teichmann

// Import the awt library
import java.awt.*;
// Import the Action Event Listener
import java.awt.event.ActionEvent;
// Import Array List Utility
import java.util.ArrayList;
// Import the JButton
import javax.swing.JButton;
// Import the JMenu
import javax.swing.JMenu;
// Import the JMenuBar
import javax.swing.JMenuBar;
// Import the JMenuItem
import javax.swing.JMenuItem;
// Import the JOptionPane
import javax.swing.JOptionPane;
// Import the JPanel
import javax.swing.JPanel;

/**
 * TicTacToe Game
 */
public class TicTacToeGame extends MyJFrame {

    // Declare two constants that will be used for the dimensions of the Tic Tac Toe game.
    final int ROWS = 3, COLUMNS = 3;
    // Create a new JPanel for the application
    JPanel jPanel = new JPanel();
    // Create a new array list of JButtons called buttons
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    // Declare a string to hold the value of the current player.
    String currentPlayer = "X";
    // Declare a Color object to hold the value of the current player's color
    Color currentPlayerColor = Color.RED;
    // Declare a Font object for the font of the buttons
    Font buttonFont  = new Font(Font.SANS_SERIF, Font.BOLD, 200);
    // Create a JMenuBar called menuBar
    JMenuBar menuBar = new JMenuBar();
    // Create a variable that tracks player "X" wins
    int xWins;
    // Create a variable that tracks player "O" wins
    int oWins;
    // Create a variable to track the number of turns.
    int turn = 1;

    // Default Constructor for the TicTacToe Game
    public TicTacToeGame() {
        // Call the MyJFrame constructor with the title "Tic Tac Toe Game"
        super("Tic Tac Toe Game");

        // Create the Top Menu
        CreateTopMenuBar();
        // set the Frame's menu bar to the menuBar created
        setJMenuBar(menuBar);

        // Create a gird layout for the panel
        jPanel.setLayout(new GridLayout(ROWS, COLUMNS));

        // For the number of squares in the dimensions
        for (int i = 0; i < ROWS * COLUMNS; i++) {
            // Create a new JButton
            JButton btn = new JButton();
            // Set the button font
            btn.setFont(buttonFont);
            // Add an event listener that calls the ButtonClicked method
            btn.addActionListener(e -> ButtonClicked(e));
            // Add the button to the array of buttons
            buttons.add(btn);
            // Add the button to the panel
            jPanel.add(btn);
        }

        setContentPane(this.jPanel);
    }

    public void CreateTopMenuBar() {
        // Create a new JMenu
        JMenu menu = new JMenu("Game Options");
        // Create a new item for the menu that will reset the game
        JMenuItem resetGameItem = new JMenuItem("Reset Game");
        // Set an action Listener on the reset game item that calls the ResetGame method.
        resetGameItem.addActionListener(e -> ResetGame());
        // Add the Menu Item to the menu
        menu.add(resetGameItem);
        // add the menu to the menu bar
        menuBar.add(menu);
    }

    public void ResetGame() {
        currentPlayer = "X";
        currentPlayerColor = Color.RED;

        for (int i = 0; i < buttons.size(); i++) {
            JButton btn = buttons.get(i);
            btn.setText("");
            btn.setBackground(null);
            btn.setEnabled(true);
        }

        turn = 1;
    }

    public void ButtonClicked(ActionEvent e) {

        JButton btnClicked = (JButton)(e.getSource());

        btnClicked.setText(currentPlayer);
        btnClicked.setBackground(currentPlayerColor);
        btnClicked.setEnabled(false);

        CheckWinner();

        SwitchPlayer();

        turn++;
    }

    public void SwitchPlayer() {
        if (currentPlayer == "X") {
            currentPlayer = "O";
            currentPlayerColor = Color.BLUE;
        } else {
            currentPlayer = "X";
            currentPlayerColor = Color.RED;
        }
    }

    public void CheckWinner() {
        boolean winnerFound;

        if (
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(1).getText().equals(currentPlayer) &&
            buttons.get(2).getText().equals(currentPlayer)) {
                winnerFound = true;
        } else if (
            buttons.get(3).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(5).getText().equals(currentPlayer)) {
                winnerFound = true;
        } else if (
            buttons.get(6).getText().equals(currentPlayer) &&
            buttons.get(7).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            buttons.get(2).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(6).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(3).getText().equals(currentPlayer) &&
            buttons.get(6).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            buttons.get(1).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(7).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            buttons.get(2).getText().equals(currentPlayer) &&
            buttons.get(5).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else {
            winnerFound = false;
        }

        if (winnerFound) {
            JOptionPane.showMessageDialog(null, currentPlayer + " has won the game!");

            if (currentPlayer.equals("X")) {
                xWins++;
            } else {
                oWins++;
            }

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
        } else if (turn == 9) {
            JOptionPane.showMessageDialog(null, "Tie game!");

            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setEnabled(false);
            }
        }
    }
}