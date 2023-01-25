// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide
 * * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricksService principal to manage service principals
 */
export function getServicePrincipals(args?: GetServicePrincipalsArgs, opts?: pulumi.InvokeOptions): Promise<GetServicePrincipalsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getServicePrincipals:getServicePrincipals", {
        "applicationIds": args.applicationIds,
        "displayNameContains": args.displayNameContains,
    }, opts);
}

/**
 * A collection of arguments for invoking getServicePrincipals.
 */
export interface GetServicePrincipalsArgs {
    /**
     * List of `applicationIds` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     */
    applicationIds?: string[];
    /**
     * Only return databricks.ServicePrincipal display name that match the given name string
     */
    displayNameContains?: string;
}

/**
 * A collection of values returned by getServicePrincipals.
 */
export interface GetServicePrincipalsResult {
    /**
     * List of `applicationIds` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     */
    readonly applicationIds: string[];
    readonly displayNameContains: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide
 * * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricksService principal to manage service principals
 */
export function getServicePrincipalsOutput(args?: GetServicePrincipalsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServicePrincipalsResult> {
    return pulumi.output(args).apply((a: any) => getServicePrincipals(a, opts))
}

/**
 * A collection of arguments for invoking getServicePrincipals.
 */
export interface GetServicePrincipalsOutputArgs {
    /**
     * List of `applicationIds` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     */
    applicationIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only return databricks.ServicePrincipal display name that match the given name string
     */
    displayNameContains?: pulumi.Input<string>;
}
