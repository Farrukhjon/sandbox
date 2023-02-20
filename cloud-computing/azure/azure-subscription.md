# Azure Subscription

## CLI

### Manage Azure subscription information

    az account

#### Get a list of subscriptions for the logged in account

    az account list
    
    az account list --output/-o table

#### Get the details of a subscription

    az account show

    az account show --subscription/-id <uuid_of_subscription>

    az account show --name/-n <name_of_subscription> 

#### Set a subscription to be the current active subscription

    az account set --subscription/-id <uuid_of_subscription>

    az account set --name/-n <name_of_subscription>

#### Manage subscriptions

    az account subscription

##### Cancel subscription

    az account subscription cancel

##### Enable subscription

    az account subscription enable

##### Get all subscriptions for a tenant

    az account subscription list
    
    az account subscription list --output table

##### Get details about a specified subscription

    az account subscription show --subscription-id/-id <uuid>

##### The locations that are available for resource providers

    az account subscription list-location --subscription-id/-id <uuid>