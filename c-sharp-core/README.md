# FizzBuzz in C#

## Setup

```bash
dotnet new gitignore
dotnet new sln -n fizzbuzz
dotnet new xunit -n fizzbuzz.test
dotnet new console -n fizzbuzz
dotnet sln add ./fizzbuzz
dotnet sln add ./fizzbuzz.test/
```

### Add project reference to test project

Add to .csproj of test project.

```xml
  <ItemGroup>
    <ProjectReference Include="../fizzbuzz/fizzbuzz.csproj" />
  </ItemGroup>
```

## Add linting

Add to .csproj to enable code analysis.

```xml
<AnalysisMode>Recommended</AnalysisMode>
```

## Run tests

```bash
dotnet test
```

## Build and run

```bash
dotnet build
dotnet publish ./fizzbuzz 
```
