import math

# An isotope has half-life T.
# Return the amount of a starting mass N0
# of the isotope that remains after time t,
def compute_Nt(N0, t, T):
    # Type your code here.
    Nt = N0 * math.exp(-0.693 * t / T)
    return Nt

# Return the half-life of an isotope given that
# a mass N0 decays to Nt after time t
def compute_T(N0, Nt, t):
    # Type your code here.
    T = (-0.693 * t) / math.log(Nt / N0)
    return T

if __name__ == '__main__':
    choice = input()

    if choice == 'N':                     # Calculate amount of material
        # TODO: Read N0, t, and T from one line of input and compute Nt
        values = input().split()
        N0 = float(values[0])
        t = float(values[1])
        T = float(values[2])
        Nt = compute_Nt(N0, t, T)

        
        print(f'Nt = {Nt:.4f}')
    elif choice == 'T':                    # Calculate half-life
        # TODO: Read N0, Nt, and t from one line of input and compute T
        values = input().split()
        N0 = float(values[0])
        Nt = float(values[1])
        t = float(values[2])
        T = compute_T(N0, Nt, t)

        
        print(f'T = {T:.4f}')
    else:
        print("invalid choice")
