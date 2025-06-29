# ZIO Magnum g8

This is a g8 template for creating ZIO Magnum projects.

## Usage

To use this template, you can create a new project using the following command:

```bash
sbt new cheleb/zio-magnum.g8 --name=my-zio-magnum-project
```

* --force: If you want to overwrite an existing directory with the same name, you can add the `--force` flag.

cd into the newly created project directory:

```bash
cd my-zio-magnum-project
```


Docker Compose is included for running the application in a containerized environment. To start the application, run:

```bash
docker-compose up
```

sbt run to run the application locally.

```bash
sbt run
```

## Requirements

- Java 11 or higher
- Scala 3
- SBT (Scala Build Tool)
- Docker (for running the application in a container)



## Features

- ZIO Magnum for building reactive applications
- Scala 3 support
- PostgreSQL for database management
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