# Project 3
## Description
    This Project aims to be the assembler for Pass 1.
    In pass 1, the program will create a symbol table with the relative and
    physical addresses. The user will only see the program print out the relative
    addresses. The program in the background will create a file with both addresses.
    In addition the file created will hold the program loaded on the app.
## Run this Program
### The Easy Way
    1. Run the make file with your command line argument naming the file to be
        processed.

### The Manual Way
    1. Compile the file with the command "javac sicasm.java"
    2. Run the program with the command "java sicasm 'file to be processed'"

## Files
### Testfile
    The sample input file.
### SICOPS
    This file contains all the command's
### Results

### Generated Files
#### Temp Lst
    This will be made into an lst just like sicasm down the road.

## Program Details
    Pass 1 will construct the symbol table, the addresses associated
    with each instruction, addresses of each label. The input file will be
    in fixed format:

    Col 1-8    label optional
    Col 9      blank
    Col 10     + optional
    Col 11-17  mnemonic		
    Col 18     blank
    Col 19     #, @, =  ... optional
    Col 20-29  (operand) label, register, ',',X optional  ...
    Col 30-31  blank
    Col 32-80  comments optional (NO PERIOD REQUIRED)

### Error Handling
    Duplicate/Undefined Labels will cause an to be error reported and the
    program will continue to run. For Project 4 this will not allow it to do
    Pass 2.

    Invalid mnemonics will be treated as a 3 byte command and will result in
    error reported to user. For Project 4 this will not allow it to do
    Pass 2.

    If there is an invalid line it wont process the line and just print it out
    and ignore it for calculations.
