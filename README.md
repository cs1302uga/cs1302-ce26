# cs1302-ce26 Tic-Tac-Toe Solver

This class exercise futher explores the concept of [recursion](https://github.com/cs1302uga/cs1302-ce26).

You will write a method to print all possible Tic-Tac-Toe boards from a given starting point. Some helpful
utility methods are provided for you in a jar file contained in the provided Maven project.

## References and Prerequisites

* [`CSCI 1302 Recursion Tutorial`](https://github.com/cs1302uga/cs1302-tutorials/blob/master/recursion.md)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Let's do some pair programming! Team up with one other person and make sure you only have one 
   laptop out. 

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce26`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce26.git
   ```

1. Change into the `cs1302-ce26` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```
   
## Exercise Steps

1. While looking in the `src` directory, you likely saw a file called `ttt_util.jar`. This file
   contains a Tic-Tac-Toe utility class with some helpful methods.
   Take a few minutes to read the documentation for these methods here: 
   [TTT Utility}(http://cobweb.cs.uga.edu/~barnes/cs1302-ttt/)

1. Look in the `TTTSolver.java` class. Read through the main method and what is given to you.

1. **Next, use Maven to compile and run the code.** You won't see any output at
   this point. Please use the `exec:java` phase to run. To provide command-line
   arguments to your program through maven, you will need to specify the 
   command-line arguments as a space-separated
   string with the `-Dexec.args` option (e.g., `-Dexec.args="src target"`) in 
   addition to providing the `-Dexec.mainClass` option. 
   
   * Once you figure out how to run it, please write down that command
     in your notes.
   
   * After you've confirmed that it compiles and runs, please add and commit
     your changes to the repository.

1. Switch drivers

**CHECKPOINT**

1. Implement the `printAllBoards` method.

1. **Next, use Maven to compile and run the code.** Please use the `exec:java` phase to run.
   You will need to specify the command-line arguments as a space-separated
   string with the `-Dexec.args` option (e.g., `-Dexec.args="src"`) in addition
   to providing the `-Dexec.mainClass` option. 
   
   * Once you figure out how to run it, please write down that command
     in your notes.
   
   * After you've confirmed that it compiles and runs, please add and commit
     your changes to the repository.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
