### Azure Resource Manager (ARM) template - Deploy Azure infrastructure

### Literature and Resources

1. [Azure Resource Manager](https://learn.microsoft.com/en-us/cli/azure/service-page/azure%20resource%20manager?view=azure-cli-latest)
2. [Understand the structure and syntax of ARM templates](https://learn.microsoft.com/en-us/azure/azure-resource-manager/templates/syntax)

- Objectives
    - Implement a JSON ARM template.
    - Declare resources and add flexibility to your template by adding:
        - resources
        - parameters
        - outputs
- What is ARM template?
    - it's a `JSON` file
    - is used `to define and deploy`
        - `infrastructure`
        - `configuration`
- The top level `elements` of ARM file
  - `schema`
  - `contentVersion`
  - `apiProfile`
  - `parameters`
  - `variables`
  - `functions`
  - `resources`
  - `output`
- ARMs are `idempotent`
  - If the `resource already exists` and `no change` is detected in the properties `no action` is taken
  - If the `resource already exists` and a property `has changed`, the `resource is updated`
  - If the `resource doesn't exist`, it's `created`

- [Create and Deploy ARM](#create-and-deploy-arm)
  - [Create an ARM template](#create-an-arm-template)
  - [Sign in to Azure](#sign-in-to-azure)
  - Set the default Resource Group
  - Deploy the template to Azure
  - Add a resource to the ARM template
  - Deploy the updated ARM template
  - Check the deployment
- [Parameters and Outputs to ARM](#parameters-and-outputs-to-arm)
  - [ARM template Parameters](#arm-template-parameters)
  - [ARM template Outputs](#arm-template-outputs)

### Create and Deploy ARM

#### Create an ARM template

- Create a new file called `azuredeploy.json`
- Put below record (or use code completion of Visual Studio Code):

#### JSON Template format

```json
{
  "$schema": "https://schema.management.azure.com/schemas/2019-04-01/deploymentTemplate.json#",
  "contentVersion": "1.0.0.0",
  "parameters": {},
  "functions": [],
  "variables": {},
  "resources": [],
  "outputs": {}
}
```

#### Descriptions of the Elements of the ARM Template

| Element          | Description                                                                                                             | Required |
|------------------|-------------------------------------------------------------------------------------------------------------------------|----------|
| `$schema `       | Location of the JSON schema file that describes the version of the template language.                                   | Y        |
| `contentVersion` | When deploying resources using the template, this value can be used to make sure that the right template is being used. | Y        |
| `apiProfile`     | An API version that serves as a collection of API versions for resource types.                                          | No       |
| `parameters`     | Values that are provided when deployment is executed to customize resource deployment.                                  | No       |
| `variables`      | Values that are used as JSON fragments in the template to simplify template language expressions.                       | No       |
| `functions`      | User-defined functions that are available within the template.                                                          | No       |
| `resources`      | Resource types that are deployed or updated in a resource group or subscription.                                        | No       |
| `outputs`        | Values that are returned after deployment.                                                                              | No       |

#### Sign in to Azure

```
    az login
```

#### Set the default Resource Group

```
    az configure --defaults group=learn-2d6faa8d-2bf2-48c3-9d78-d7a1205cd0a4
```

#### Deploy the template to Azure

| Command                      | Description                                       |
|------------------------------|---------------------------------------------------|
| `az deployment create`       | Start a deployment at subscription scope.         |
| `az deployment group`        | Manage ARM template deployment at resource group. |
| `az deployment group create` | Start a deployment at resource group.             |
| `az deployment group list`   | List deployments at resource group.               |

```
    templateFile="azuredeploy.json"
    today=$(date +"%d-%b-%Y")
    DeploymentName="blanktemplate-"$today
    
    az deployment group create \
    --name $DeploymentName \
    --template-file $templateFile
```

#### Add a resource to the ARM template

```json
{
  "resources": [
    {
      "name": "rssattorov1084",
      "type": "Microsoft.Storage/storageAccounts",
      "apiVersion": "2021-04-01",
      "tags": {
        "displayName": "rssattorov1084"
      },
      "location": "[resourceGroup().location]",
      "kind": "StorageV2",
      "sku": {
        "name": "Standard_LRS",
        "tier": "Standard"
      }
    }
  ]
}
```

### Parameters and Outputs to ARM

#### ARM template parameters

```
"parameters": {
  "<parameter-name>": {
    "type": "<type-of-parameter-value>",
    "defaultValue": "<default-value-of-parameter>",
    "allowedValues": [
      "<array-of-allowed-values>"
    ],
    "minValue": <minimum-value-for-int>,
    "maxValue": <maximum-value-for-int>,
    "minLength": <minimum-length-for-string-or-array>,
    "maxLength": <maximum-length-for-string-or-array-parameters>,
    "metadata": {
      "description": "<description-of-the-parameter>"
    }
  }
}
```

#### ARM template Outputs