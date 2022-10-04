// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Getting the existing cluster id of specific databricks.Job by name or by id:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getJob({
 *     jobName: "My job",
 * });
 * export const clusterId = _this.then(_this => _this.jobSettings?.settings?.newCluster?.numWorkers);
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getJobs data to get all jobs and their names from a workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getJob(args?: GetJobArgs, opts?: pulumi.InvokeOptions): Promise<GetJobResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("databricks:index/getJob:getJob", {
        "jobId": args.jobId,
        "jobName": args.jobName,
        "jobSettings": args.jobSettings,
    }, opts);
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobArgs {
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    jobId?: string;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    jobName?: string;
    /**
     * the same fields as in databricks_job.
     */
    jobSettings?: inputs.GetJobJobSettings;
}

/**
 * A collection of values returned by getJob.
 */
export interface GetJobResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    readonly jobId: string;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    readonly jobName: string;
    /**
     * the same fields as in databricks_job.
     */
    readonly jobSettings: outputs.GetJobJobSettings;
}

export function getJobOutput(args?: GetJobOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobResult> {
    return pulumi.output(args).apply(a => getJob(a, opts))
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobOutputArgs {
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    jobId?: pulumi.Input<string>;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    jobName?: pulumi.Input<string>;
    /**
     * the same fields as in databricks_job.
     */
    jobSettings?: pulumi.Input<inputs.GetJobJobSettingsArgs>;
}
