# Azure Kubernetes Services

## CLI

### Manage Azure Kubernetes Services

    az aks

#### List managed Kubernetes clusters

    az aks list # for Default resource group
    
    az aks list --resource-group/-g <group_name>

#### Show the details for a managed Kubernetes cluster

    az aks show --name/-n #Name of the managed cluster is required.
    
    az aks show --resource-group/-g --name/-n #Name of resource group is set or default if misssed.

