# Basic Steps to create a threejs app

### Step 1: declare scene, camera, renderer global variables

        var scene;
        var camera;
        var renderer;

### Step 2: Create function init()

    function init() {}

### Step 3: instantiate a scene (in the function body)

        scene = new THREE.Scene();

### Step 4: instantiate a camera (in the function body)

        camera = new THREE.PerspectiveCamera();

### Step 5: instantiate a renderer (in the function body)

        // sets the background color and the size
        renderer = new THREE.WebGLRenderer();

### Step 6: add the output of the renderer to the html element  (in the function body)

    document.body.appendChild(renderer.domElement);

### Step 7: call the render function  (in the function body)

    renderer.render(scene, camera);

### Step 8: calls the init function when the window is done loading

    window.onload = init;

