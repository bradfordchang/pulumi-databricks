// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetJob
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Getting the existing cluster id of specific databricks.Job by name or by id:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetJob.Invoke(new()
        ///     {
        ///         JobName = "My job",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["clusterId"] = @this.Apply(getJobResult =&gt; getJobResult).Apply(@this =&gt; @this.Apply(getJobResult =&gt; getJobResult.JobSettings?.Settings?.NewCluster?.NumWorkers)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.getJobs data to get all jobs and their names from a workspace.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Task<GetJobResult> InvokeAsync(GetJobArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetJobResult>("databricks:index/getJob:getJob", args ?? new GetJobArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Getting the existing cluster id of specific databricks.Job by name or by id:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetJob.Invoke(new()
        ///     {
        ///         JobName = "My job",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["clusterId"] = @this.Apply(getJobResult =&gt; getJobResult).Apply(@this =&gt; @this.Apply(getJobResult =&gt; getJobResult.JobSettings?.Settings?.NewCluster?.NumWorkers)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.getJobs data to get all jobs and their names from a workspace.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Output<GetJobResult> Invoke(GetJobInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetJobResult>("databricks:index/getJob:getJob", args ?? new GetJobInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJobArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        [Input("jobId")]
        public string? JobId { get; set; }

        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        [Input("jobName")]
        public string? JobName { get; set; }

        /// <summary>
        /// the same fields as in databricks_job.
        /// </summary>
        [Input("jobSettings")]
        public Inputs.GetJobJobSettingsArgs? JobSettings { get; set; }

        public GetJobArgs()
        {
        }
        public static new GetJobArgs Empty => new GetJobArgs();
    }

    public sealed class GetJobInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        [Input("jobName")]
        public Input<string>? JobName { get; set; }

        /// <summary>
        /// the same fields as in databricks_job.
        /// </summary>
        [Input("jobSettings")]
        public Input<Inputs.GetJobJobSettingsInputArgs>? JobSettings { get; set; }

        public GetJobInvokeArgs()
        {
        }
        public static new GetJobInvokeArgs Empty => new GetJobInvokeArgs();
    }


    [OutputType]
    public sealed class GetJobResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        public readonly string JobId;
        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        public readonly string JobName;
        /// <summary>
        /// the same fields as in databricks_job.
        /// </summary>
        public readonly Outputs.GetJobJobSettingsResult JobSettings;

        [OutputConstructor]
        private GetJobResult(
            string id,

            string jobId,

            string jobName,

            Outputs.GetJobJobSettingsResult jobSettings)
        {
            Id = id;
            JobId = jobId;
            JobName = jobName;
            JobSettings = jobSettings;
        }
    }
}