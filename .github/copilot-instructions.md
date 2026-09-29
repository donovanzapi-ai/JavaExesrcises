# Project Instructions

- This is a beginner Java exercise repository. Keep changes focused and explain concepts in straightforward Java.
- Exercise source files live in `Exercises/` and use the case-sensitive package declaration `package Exercises;`.
- Put each public class in a file with the matching class name. Keep APIs compatible with the imports and expectations in `Tests.java`.
- Do not modify `Tests.java`; add or adjust separate tests only when explicitly requested.
- There is no configured build system. From the repository root, compile and run the provided checks with:

  ```bash
  rm -rf out
  mkdir out
  javac -d out Exercises/*.java Tests.java
  java -cp out Tests
  ```

- Keep generated `.class` files and the `out/` directory out of source control.