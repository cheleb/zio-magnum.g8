# ZIO Magnum g8

This is a g8 template for creating ZIO Magnum projects.

## Usage

To use this template, you can create a new project using the following command:

```bash
sbt new cheleb/zio-magnum.g8
```

## Features

- ZIO Magnum for building reactive applications
- Scala 3 support
- SBT for build management
- Basic project structure with example code

## Project Structure

```
my-zio-magnum-project/
├── build.sbt
│── db/
│   └── init.sql
├── docker-compose.yml
├── project/
│   └── build.properties
├── src/
│   ├── main/
│   │   ├── scala/
│   │   │   └── com/example/
│   │   │       └── Main.scala
│   │   └── resources/
│   │       └── application.conf
│   └── test/
│       ├── scala/
│       │   └── com/example/
│       │
│       └── resources/
│           └── sql/
│               └── user.sql
└── README.md
```