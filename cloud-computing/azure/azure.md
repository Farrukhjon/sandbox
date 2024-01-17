# Microsoft Azure

## Literature and Resources

- [Microsoft Azure](https://en.wikipedia.org/wiki/Microsoft_Azure)
- [Exam AZ-900: Microsoft Azure Fundamentals (Video), 2nd Edition](https://learning.oreilly.com/videos/exam-az-900-microsoft/9780137307005/)
- [Azure Administration: Implement and Manage Application Services](https://www.linkedin.com/learning/azure-administration-implement-and-manage-application-services)

## Topics

- What is Azure?
- What is an Azure account?
- What is an Azure `subscription`?
- What is a `resource` in Azure?
- What is a `resource group`?
- What is Azure `Portal`?

## What is Azure?

- is Microsoft's public `cloud computing platform`
- it provides a broad `range of cloud services`
    - `compute`
    - `analytics`
    - `storage`
    - `networking`

## What is an Azure account?

- It's a `global unique entity`
- It gets `access to Azure services` and `subscriptions`

## What is an Azure `subscription`?

- It's `a logical container`
- It's used to `provision resources` in Azure
- It holds the `details` of all resources
    - like virtual machines (`VMs`)
    - `databases`
    - `and more`

## What is a `resource` in Azure?

- a `manageable item` that is available through Azure
- examples
    - `virtual machines`
    - `virtual networks`
    - `storage accounts`
    - `web apps`
    - `databases`

## What is a `resource group`?

- `is a logical container`
- it `holds related resources` for an Azure solution
- can include `all the resources for the solution`
- or only those resources that you want to `manage as a group`
- is used to add resources that `share the same lifecycle` to the `same resource group`

## What is Azure `Portal`?

- is a `web-based`
- is a unified console that provides an `alternative to command-line tools`
- it allows to `manage` Azure subscription using a GUI
- it allows to `build`, `manage`, and `monitor` everything

## Azure Portal

- Host apps
    - Ways to host apps
        - Azure Portal
        - CLI
        - Script
        - IDE

### How to use the Azure portal to create a web app

#### Azure App Service

- platform as a service (PaaS
- Azure takes care of the infrastructure
    - to run apps
    - to scale apps
- Deployment slots

### Deploy Azure infrastructure by using JSON ARM templates

- Implement a JSON ARM template by using Visual Studio
- Declare resources and add flexibility to your template by adding resources, parameters, and outputs
- **ARM** templates
    - is **Azure Resource Manager** templates
    - specifies project's infrastructure
        - declaratively
        - reusable
        - JSON format