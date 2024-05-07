# java-14-features

### Configurations to use "Preview" features in Java 14

Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 14

-- Override compiler parameters per-module:

- Module: java-14-features
- Compilation Options: --enable-preview

Run/Debug Configurations > Application > [Choose Application] :

Build and Run > Modify Options > Add VM Options : --enable-preview

# New Preview Features

- JEP 305: Pattern Matching for instanceof (Preview)
- JEP 359: Records (Preview)

# New Features

- JEP 361: Switch Expressions