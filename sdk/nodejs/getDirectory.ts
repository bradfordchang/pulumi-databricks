// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const prod = databricks.getDirectory({
 *     path: "/Production",
 * });
 * ```
 */
export function getDirectory(args: GetDirectoryArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getDirectory:getDirectory", {
        "objectId": args.objectId,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryArgs {
    /**
     * directory object ID
     */
    objectId?: number;
    /**
     * Path to a directory in the workspace
     */
    path: string;
}

/**
 * A collection of values returned by getDirectory.
 */
export interface GetDirectoryResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * directory object ID
     */
    readonly objectId: number;
    readonly path: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const prod = databricks.getDirectory({
 *     path: "/Production",
 * });
 * ```
 */
export function getDirectoryOutput(args: GetDirectoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryResult> {
    return pulumi.output(args).apply((a: any) => getDirectory(a, opts))
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryOutputArgs {
    /**
     * directory object ID
     */
    objectId?: pulumi.Input<number>;
    /**
     * Path to a directory in the workspace
     */
    path: pulumi.Input<string>;
}
