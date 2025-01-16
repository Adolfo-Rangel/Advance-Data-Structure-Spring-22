Exception Handling in Java is a mechanism to handle runtime errors, ensuring normal program flow. It involves using try-catch blocks to catch and handle exceptions, preventing the program from crashing.

Key Concepts
Exception: An error or unexpected event during runtime (e.g., dividing by zero, accessing an invalid array index).
Types of Exceptions:
Checked Exceptions: Must be handled or declared (e.g., IOException).
Unchecked Exceptions: Occur at runtime, not mandatory to handle (e.g., ArithmeticException).
Throwable Hierarchy:
Throwable → Exception → Handles application errors.
Throwable → Error → Represents serious system-level errors.

Common Keywords
try: Defines a block of code to test for exceptions.
catch: Catches and handles exceptions.
finally: Executes code after try and catch, whether an exception occurs or not.
throw: Used to explicitly throw an exception.
throws: Declares exceptions in a method signature.

Benefits of Exception Handling
Prevents program crashes.
Makes code more robust and fault-tolerant.
Helps isolate error-handling logic from main code logic
