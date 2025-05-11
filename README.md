#### My own LSF4J provider implementation (×͜×).

#### Visit
<a>https://dev.to/c4rlosmonteiro/how-to-create-your-logging-system-using-slf4j-42o6</a>

#### Structure

* [../provider] It contains the newly created log provider.
* [../provider-user] It contains a simple main class that will use this newly created log provider.

In the project files the existing main class will produce the logs below, showing an example of the logs produced by this log provider.


```
[INFO][com.github.c4rlosmonteiro.slf4jworstprovideruser.Main] Generating hello world messages! (×͜×)
[DEBUG][com.github.c4rlosmonteiro.slf4jworstprovideruser.HelloWorkGenerator] Generating hello world message for [Bob] (×͜×)
[INFO][com.github.c4rlosmonteiro.slf4jworstprovideruser.Main] :: Hello Bob! (×͜×)
[DEBUG][com.github.c4rlosmonteiro.slf4jworstprovideruser.HelloWorkGenerator] Generating hello world message for [Paul] (×͜×)
[INFO][com.github.c4rlosmonteiro.slf4jworstprovideruser.Main] :: Hello Paul! (×͜×)
[DEBUG][com.github.c4rlosmonteiro.slf4jworstprovideruser.HelloWorkGenerator] Generating hello world message for [Marcus] (×͜×)
[INFO][com.github.c4rlosmonteiro.slf4jworstprovideruser.Main] :: Hello Marcus! (×͜×)
```
