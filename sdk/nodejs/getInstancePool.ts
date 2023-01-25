// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Referring to an instance pool by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const pool = databricks.getInstancePool({
 *     name: "All spot",
 * });
 * const myCluster = new databricks.Cluster("myCluster", {instancePoolId: data.databricks_instance_pool.pool.id});
 * // ...
 * ```
 */
export function getInstancePool(args: GetInstancePoolArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancePoolResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getInstancePool:getInstancePool", {
        "name": args.name,
        "poolInfo": args.poolInfo,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstancePool.
 */
export interface GetInstancePoolArgs {
    /**
     * Name of the instance pool. The instance pool must exist before this resource can be planned.
     */
    name: string;
    /**
     * block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
     */
    poolInfo?: inputs.GetInstancePoolPoolInfo;
}

/**
 * A collection of values returned by getInstancePool.
 */
export interface GetInstancePoolResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
     */
    readonly poolInfo: outputs.GetInstancePoolPoolInfo;
}
/**
 * ## Example Usage
 *
 * Referring to an instance pool by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const pool = databricks.getInstancePool({
 *     name: "All spot",
 * });
 * const myCluster = new databricks.Cluster("myCluster", {instancePoolId: data.databricks_instance_pool.pool.id});
 * // ...
 * ```
 */
export function getInstancePoolOutput(args: GetInstancePoolOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstancePoolResult> {
    return pulumi.output(args).apply((a: any) => getInstancePool(a, opts))
}

/**
 * A collection of arguments for invoking getInstancePool.
 */
export interface GetInstancePoolOutputArgs {
    /**
     * Name of the instance pool. The instance pool must exist before this resource can be planned.
     */
    name: pulumi.Input<string>;
    /**
     * block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
     */
    poolInfo?: pulumi.Input<inputs.GetInstancePoolPoolInfoArgs>;
}
