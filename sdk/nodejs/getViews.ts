// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to manage schemas within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getViews(args: GetViewsArgs, opts?: pulumi.InvokeOptions): Promise<GetViewsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getViews:getViews", {
        "catalogName": args.catalogName,
        "ids": args.ids,
        "schemaName": args.schemaName,
    }, opts);
}

/**
 * A collection of arguments for invoking getViews.
 */
export interface GetViewsArgs {
    /**
     * Name of databricks_catalog
     */
    catalogName: string;
    /**
     * set of databricksView full names: *`catalog`.`schema`.`view`*
     */
    ids?: string[];
    /**
     * Name of databricks_schema
     */
    schemaName: string;
}

/**
 * A collection of values returned by getViews.
 */
export interface GetViewsResult {
    readonly catalogName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * set of databricksView full names: *`catalog`.`schema`.`view`*
     */
    readonly ids: string[];
    readonly schemaName: string;
}
/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to manage schemas within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getViewsOutput(args: GetViewsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetViewsResult> {
    return pulumi.output(args).apply((a: any) => getViews(a, opts))
}

/**
 * A collection of arguments for invoking getViews.
 */
export interface GetViewsOutputArgs {
    /**
     * Name of databricks_catalog
     */
    catalogName: pulumi.Input<string>;
    /**
     * set of databricksView full names: *`catalog`.`schema`.`view`*
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of databricks_schema
     */
    schemaName: pulumi.Input<string>;
}
