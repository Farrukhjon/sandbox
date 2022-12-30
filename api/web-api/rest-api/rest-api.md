# REST API

## Literature and Resources
 1. [Representational State Transfer](https://en.wikipedia.org/wiki/Representational_state_transfer)
 2. [Architectural Styles and the Design of Network-based Software Architectures](https://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm)
 3. [REST API Tutorial](https://restfulapi.net/)
 4. [What is JSON](https://restfulapi.net/introduction-to-json/)

## What is REST?

## Client–Server architecture

## Constraints

## Naming Resources

## HTTP Methods

## Caching ("Cacheability")

## Compression

## Content Negotiation

## Idempotency

## Stateless

## Security

## Versioning

## HATEOAS

## JSON and JSONPath

### JSONPath
 - is a query language for JSON
 - its features similar to XPath for XML
 - is used for selecting and extracting a subsection from the JSON document

JSONPath's syntax rules
 - `$` symbol refers to the root object or element.
 - `@` symbol refers to the current object or element.
 - `.` operator is the dot-child operator, which you use to denote a child element of the current element.
 - `[ ] `is the subscript operator, which you use to denote a child element of the current element (by name or index).
 - `* `operator is a wildcard, returning all objects or elements regardless of their names.
 - `,` operator is the union operator, which returns the union of the children or indexes indicated.
 - `:` operator is the array slice operator, so you can slice collections using the syntax [start:end:step] to return a subcollection of a collection.
 - `( )` operator lets you pass a script expression in the underlying implementation’s script language. It’s not supported by every implementation of JSONPath, however.
 - `? ( )` to query all items that meet a certain criteria.