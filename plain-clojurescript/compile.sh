#!/bin/bash
echo Compiling...
mkdir -p out/
cljsc src > out/main.js
echo Done