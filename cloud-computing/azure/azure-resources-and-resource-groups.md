# Azure Resources and Resource Groups

## What is a resource group?

- `is a logical container`
- it `holds related resources` for an Azure solution
- can include `all the resources for the solution`
- or only those resources that you want to `manage as a group`
- is used to add resources that `share the same lifecycle` to the `same resource group`
- in a single resource group, one can then deploy and manage all those resources as a single entity

## Advantages of organizing resources in a resource group

- Easily set up deployments using a feature known as an Azure Resource Manager (ARM) template
- ARM template deployments are typically for a single resource group
- Can deploy to multiple resource groups
- Can name a resource group with an easily `recognizable name`
- Can have resources from `multiple subscriptions` `in a single resource group`
- Can `move` Azure `resources` `from one resource group to another`