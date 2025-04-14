@echo off

set EVOSUITE_VERSION=latest
set JAVA_VERSION=11     

set PROJECT_DIR=%cd:\=/%

rem echo Pulling EvoSuite Docker image...
rem docker pull evosuite/evosuite:%EVOSUITE_VERSION%-java-%JAVA_VERSION%

echo Running EvoSuite...
docker run -it -v "%PROJECT_DIR%:/evosuite" evosuite/evosuite:%EVOSUITE_VERSION%-java-%JAVA_VERSION% %*