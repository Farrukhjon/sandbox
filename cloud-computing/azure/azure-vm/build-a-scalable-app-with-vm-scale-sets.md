# Build a scalable application with Virtual Machine scale sets (VMSS)

- Identify the features and capabilities of virtual machine scale sets.
- Identify the use cases for running applications on virtual machine scale sets.
- Deploy an application on a virtual machine scale set.

## Azure Virtual Machine Scale Sets (VMss)

- scalable way to run apps
- on a set of VMs.
- The VMs in this type of scale set all have the same configuration
- Run the same apps.

### Deploy VMs SS

#### Step 1 - create a file named `cloud-init.yaml`:

```shell
code cloud-init.yaml
```

#### Step 2 - Add the following text to the file:

```yaml
#cloud-config
package_upgrade: true
packages:
  - nginx
write_files:
  - owner: www-data:www-data
  - path: /var/www/html/index.html
    content: |
      Hello world from Virtual Machine Scale Set !
runcmd:
  - service nginx restart
```

#### Step 3 - Create a new resource group named `scalesetrg` for your scale set:

```shell
az group create \
  --location westus3 \
  --name scalesetrg
```

#### Step 4  - Create the Virtual Machine Scale Set:

```shell
az vmss create \
  --resource-group scalesetrg \
  --name webServerScaleSet \
  --image UbuntuLTS \
  --upgrade-policy-mode automatic \
  --custom-data cloud-init.yaml \
  --admin-username azureuser \
  --generate-ssh-keys
```

#### Step 5 - Add a health probe to the load balance:

```shell
az network lb probe create \
  --lb-name webServerScaleSetLB \
  --resource-group scalesetrg \
  --name webServerHealth \
  --port 80 \
  --protocol Http \
  --path /
```

#### Step 6 - Configure the load balancer to route HTTP traffic to the instances in the scale set:

```shell
az network lb rule create \
  --resource-group scalesetrg \
  --name webServerLoadBalancerRuleWeb \
  --lb-name webServerScaleSetLB \
  --probe-name webServerHealth \
  --backend-pool-name webServerScaleSetLBBEPool \
  --backend-port 80 \
  --frontend-ip-name loadBalancerFrontEnd \
  --frontend-port 80 \
  --protocol tcp
```

#### Step 7 - Test the Virtual Machine Scale Set:

### Configure VMs SS
#### Scale number VMs of instances

```shell
az vmss scale \
    --name MyVMScaleSetName \
    --resource-group MyResourceGroupName \
    --new-capacity 6
```