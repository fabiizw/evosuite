# Testing App Evosuite

## Getting Started

1. **Make sure that Docker is running.**

2. **Run `evosuite.bat` with optional parameters:**
    ```sh
    ./evosuite.bat [optional parameters]
    ```

## Optional Parameters
 * `--criterion`: Specifies the coverage criteria to be used. The default criteria are LINE, BRANCH, EXCEPTION, WEAKMUTATION, OUTPUT, METHOD, METHODNOEXCEPTION, and CBRANCH.
 * `--Doutput_variables`: Defines the variables to be included in the output. The default is 60s.
 * `--DsearchBudget`: Specifies the time budget for the search process in seconds.
 * `--Dminimize`: Deactivates the minimization of test cases. By default, EvoSuite removes all statements that are not strictly needed to satisfy the coverage goals. Set to `false` to deactivate.
 * `--Dassertion_strategy`: Changes the assertion generation strategy. For example, set to `all` to generate more assertions.
 * `--measureCoverage`: Activates the measurement of code coverage during the test generation process.
 * `--Duse_separate_classloader`: Determines whether to use a separate class loader for each test. Set to `false` to disable this feature.

For more parameters, refer to the [EvoSuite Runtime Variables](https://github.com/EvoSuite/evosuite/blob/master/client/src/main/java/org/evosuite/statistics/RuntimeVariable.java).

## Example

```sh
./evosuite.bat -target target/classes -Doutput_variables="TARGET_CLASS,criterion,Size,Length,Coverage,BranchCoverage,MutationScore" -Duse_separate_classloader=false

```

## Running on a Single Class

```sh
./evosuite.bat -class MyJavaClass -projectCP target/classes 
./evosuite.bat -class org.apache.commons.lang3.text.StrSubstitutor -projectCP target/classes
```

## Running on Multiple Classes

```sh
./evosuite.bat -listClasses -target target/classes
./evosuite.bat -target target/classes
```sh
./evosuite.bat -prefix my.package.com -target target/classes
```
```

## Reports

JaCoCo and PIT test reports can be found under the `target` folder. Analysis is always started with the following command:

```sh
mvn test
```

## Technologies Used

- **Java 8**: The application is built using Java 8.
- **EvoSuite v1.0.6**: Used for automated test generation.
- **JaCoCo 0.8.12**: Used for code coverage analysis.
- **PIT 1.17.4**: Used for mutation testing.