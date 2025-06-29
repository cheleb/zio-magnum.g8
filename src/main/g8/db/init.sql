CREATE DATABASE "$dbName$";

\connect "$dbName$";
-- Create a table for users
CREATE TABLE "users"(
    id serial PRIMARY KEY,
    name text NOT NULL
);

