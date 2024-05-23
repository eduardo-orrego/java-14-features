# java-14-features
## New Features
![feature.png](src/main/resources/feature.png)
## New Preview Features
![preview.png](src/main/resources/preview.png)
## Settings in IntelliJ IDEA to use "Preview" features with Java 14
#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :
- #### Project bytecode version: 14
- #### Per-module bytecode version:
    - #### Module: java-14-features
    - #### Target bytecode version: 14
- #### Javac Options:
    - #### Additional command line parameters: --enable-preview
#### Run/Debug Configurations > Application > [Choose Application] :
- #### Build and Run > Modify Options > Add VM Options :
    - #### VM Options: --enable-preview