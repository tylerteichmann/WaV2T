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

    /**
     * Creates the top menu bar
     */
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

    /**
     * Method to reset the game
     */
    public void ResetGame() {
        // Set the current playre to X
        currentPlayer = "X";
        // Change the current players color back to red
        currentPlayerColor = Color.RED;

        // loop through the array that contains the buttons
        for (int i = 0; i < buttons.size(); i++) {
            // get the btn and stor it in a variable called btn
            JButton btn = buttons.get(i);
            // Set its text back to empty
            btn.setText("");
            // Set its background to the default null
            btn.setBackground(null);
            // Re enable the button
            btn.setEnabled(true);
        }

        // Reset the turn count to one.
        turn = 1;
    }

    /**
     * Method to handle button clicks
     */
    public void ButtonClicked(ActionEvent e) {

        // store the clicked button in a JButton variable
        JButton btnClicked = (JButton)(e.getSource());

        // set the buttons text to the player that clicked it
        btnClicked.setText(currentPlayer);
        // Set the button's color to the player that clicked it
        btnClicked.setBackground(currentPlayerColor);
        // Set the button to disabled so it can't be clicked again.
        btnClicked.setEnabled(false);

        // Check if a winner was found.
        CheckWinner();
        // Switch to the other player.
        SwitchPlayer();
        // Increment the turn
        turn++;
    }

    /**
     * Method to switch players
     */
    public void SwitchPlayer() {
        // if the current player is x
        if (currentPlayer == "X") {
            // set the current player to o
            currentPlayer = "O";
            // change the color to blue
            currentPlayerColor = Color.BLUE;
        // Else the current player is o
        } else {
            // set the current player to x
            currentPlayer = "X";
            // change the color to red
            currentPlayerColor = Color.RED;
        }
    }

    /**
     * Method to check if there is a winner
     */
    public void CheckWinner() {
        // Create a boolean to hold if a winner was found
        boolean winnerFound;

        if (
            // Check if all top row equals the current player
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(1).getText().equals(currentPlayer) &&
            buttons.get(2).getText().equals(currentPlayer)) {
                winnerFound = true;
        } else if (
            // Check if all middle row equals the current player
            buttons.get(3).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(5).getText().equals(currentPlayer)) {
                winnerFound = true;
        } else if (
            // Check if all bottom row equals the current player
            buttons.get(6).getText().equals(currentPlayer) &&
            buttons.get(7).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            // Check if all left diagonal equals the current player
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            // Check if all right diagonal equals the current player
            buttons.get(2).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(6).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            // Check if all first column equals the current player
            buttons.get(0).getText().equals(currentPlayer) &&
            buttons.get(3).getText().equals(currentPlayer) &&
            buttons.get(6).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            // Check if all second column equals the current player
            buttons.get(1).getText().equals(currentPlayer) &&
            buttons.get(4).getText().equals(currentPlayer) &&
            buttons.get(7).getText().equals(currentPlayer)){
                winnerFound = true;
        } else if (
            // Check if all third column equals the current player
            buttons.get(2).getText().equals(currentPlayer) &&
            buttons.get(5).getText().equals(currentPlayer) &&
            buttons.get(8).getText().equals(currentPlayer)){
                winnerFound = true;
        } else {
            // if none are true there is no winner
            winnerFound = false;
        }

        // if it is turn 9 or there is a winner
        if (turn == 9 || winnerFound) {
            // loop through the array of buttons
            for (int i = 0; i < buttons.size(); i++) {
                // Disable them all
                buttons.get(i).setEnabled(false);
            }
            // if a winner was found
            if (winnerFound) {
                // display the winner in a dialogue box
                JOptionPane.showMessageDialog(null, currentPlayer + " has won the game!");
                // If the current player is x
                if (currentPlayer.equals("X")) {
                    // Add a win
                    xWins++;
                // else current player is o
                } else {
                    // Add a win
                    oWins++;
                }
            // if a winner was not found
            } else {
                // Display tie game in a dialog box
                JOptionPane.showMessageDialog(null, "Tie game!");
            }
            // After boxes are closed, display how many wins each player has
            JOptionPane.showMessageDialog(null, "X Wins: " + xWins + "\nO Wins: " + oWins);
        }
    }
}