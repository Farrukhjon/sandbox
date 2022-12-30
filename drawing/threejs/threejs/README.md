# ThreeJS

## Literature and resources

- [threejs](https://threejs.org/)
- [Fundamentals](https://threejs.org/manual/#en/fundamentals)

## Install

### via node.js/npm

```shell
  npm install --save three jquery
  npm install --save-dev jest babel @babel/core babel-jest babel-preset-es2015
```

## What is Three.js?

## Elements

- Objects
    - Vertices
    - Faces
    - Normal
    - Material
        - Color
        - Images mapping

## Objects

`Objects` are made of `Vertices` and `Faces`

Example:

    Cube is made of: 8 vertices and 6 faces

## the WebGLRenderer API

## Operations on objects

- Load
- Move
- Rotate
- Scale

## Shader

- Vertex shader
    - moves the vertex to normalized clip coordinate
    - x, y, z are between -1 and 1
- Fragment shader
    - works at pixel level
    - calculate the pixel color

## Matrices

- Model
- View
- Projection

## Rendering pipeline

- from 3d data to 2d image
- Vertex shader
- Fragment shader
- Shaders are designed for parallel processing on GPU devices 
