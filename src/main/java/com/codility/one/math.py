class MathOperations:
    def add(self, a, b):
        return a + b

    def sub(self, a, b):
        return a - b
    
    def main():
        math_ops = MathOperations()
        print("Addition:", math_ops.add(5, 3))
        print("Subtraction:", math_ops.sub(5, 3))

    if __name__ == "__main__":
        main()