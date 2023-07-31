# kubectl

    Command-line interface for running commands against Kubernetes clusters.
    Some subcommands such as `kubectl run` have their own usage documentation.
    More information: <https://kubernetes.io/docs/reference/kubectl/>.

### kubectl

    kubectl command_name -h

### Display complete list of supported resources:

    kubectl api-resources

### Display an explanation of a specific resource:

    kubectl explain resource_name

### Display an explanation of a specific field of resource:

    kubectl explain resource_name.field_name

### Display list of global command-line options:

    kubectl options

### Set up `kubectl` autocomplete in bash (press Tab to use):

    source <(kubectl completion bash)

### Display all resources in all namespaces:

    kubectl get all -A

### Order events by `creationTimestamp`:

    kubectl get events --sort-by='.metadata.creationTimestamp'
    /tmp/cht.sh.NbH8ZUzobKXOH...skipping...
    cheat:kubectl

### Display list of all available commands:

    cheat:kubectl

### Display list of all available commands:

    kubectl -h

### Display an explanation of a specific command:

    kubectl command_name -h

### Display complete list of supported resources:

    kubectl api-resources

### Display an explanation of a specific resource:

    kubectl explain resource_name

### Display an explanation of a specific field of resource:

    kubectl explain resource_name.field_name

### Display list of global command-line options:

    kubectl options

### Set up `kubectl` autocomplete in bash (press Tab to use):

    source <(kubectl completion bash)

### Display all resources in all namespaces:

    kubectl get all -A

### Order events by `creationTimestamp`:

    kubectl get events --sort-by='.metadata.creationTimestamp'

### Switch context of a specific cluster:

    kubectl config use-context CONTEXT_NAME [options]

### List information about a resource with more details:

    kubectl get pod|service|deployment|ingress|... -o wide

### Update specified pod with the label 'unhealthy' and the value 'true':

    kubectl label pods name unhealthy=true

### List all resources with different types:

    kubectl get all

### Display resource (CPU/Memory/Storage) usage of nodes or pods:

    kubectl top pod|node

### Print the address of the master and cluster services:

    kubectl cluster-info

### Display an explanation of a specific field:

    kubectl explain pods.spec.containers

### Print the logs for a container in a pod or specified resource:

    kubectl logs pod_name

### Run command in an existing pod:

    kubectl exec pod_name -- ls /

### Deployment

    kubectl get deployment <name-of-a-deployment>

#### Environment variables of a deployment

    kubectl get deployment <name-of-a-deployment> -o jsonpath='{range .spec.template.spec.containers[*].env[*]}{@.name}{"="}{@.value}{"\n"}{end}'

### Pod

#### Get container in a pod

    kubectl get pods <pod.name> -o jsonpath='{.spec.containers[*].name}'

    kubectl get po -o jsonpath='{range .items[*]}{"pod: "}{.metadata.name}{"\n"}{range .spec.containers[*]}{"\tname: "}{.name}{"\n\timage: "}{.image}{"\n"}{end}'
    
    kubectl get po -o jsonpath='{range .items[*]}{"pod: "}{.metadata.name}{"\n"}{range .spec.containers[*]}{"\tname: "}{.name}{"\n\timage: "}{.image}{"\n"}{end}'
