
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements. See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership. The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM     http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.

set "JAVA_HOME=%{JAVA_HOME}"
set "MARMOTTA_HOME=%{INSTALL_PATH}\marmotta-home"
set "JAVA_OPTS=-Xmx1024m -splash:%{INSTALL_PATH}\apache-tomcat-%{TOMCAT_VERSION}\icons\splashscreen.png  -Dehcache.disk.store.dir=%{INSTALL_PATH}\marmotta-home\cache -Dfile.encoding=UTF-8 -XX:MaxPermSize=256m -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled"
set "MARMOTTA_HOME=%{INSTALL_PATH}\marmotta-home"