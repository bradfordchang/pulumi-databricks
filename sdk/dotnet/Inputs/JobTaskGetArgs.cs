// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbtTask")]
        public Input<Inputs.JobTaskDbtTaskGetArgs>? DbtTask { get; set; }

        [Input("dependsOns")]
        private InputList<Inputs.JobTaskDependsOnGetArgs>? _dependsOns;
        public InputList<Inputs.JobTaskDependsOnGetArgs> DependsOns
        {
            get => _dependsOns ?? (_dependsOns = new InputList<Inputs.JobTaskDependsOnGetArgs>());
            set => _dependsOns = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        [Input("emailNotifications")]
        public Input<Inputs.JobTaskEmailNotificationsGetArgs>? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        /// <summary>
        /// Identifier that can be referenced in `task` block, so that cluster is shared between tasks
        /// </summary>
        [Input("jobClusterKey")]
        public Input<string>? JobClusterKey { get; set; }

        [Input("libraries")]
        private InputList<Inputs.JobTaskLibraryGetArgs>? _libraries;

        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        public InputList<Inputs.JobTaskLibraryGetArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobTaskLibraryGetArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        [Input("newCluster")]
        public Input<Inputs.JobTaskNewClusterGetArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.JobTaskNotebookTaskGetArgs>? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.JobTaskPipelineTaskGetArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.JobTaskPythonWheelTaskGetArgs>? PythonWheelTask { get; set; }

        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        [Input("retryOnTimeout")]
        public Input<bool>? RetryOnTimeout { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.JobTaskSparkJarTaskGetArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.JobTaskSparkPythonTaskGetArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.JobTaskSparkSubmitTaskGetArgs>? SparkSubmitTask { get; set; }

        [Input("sqlTask")]
        public Input<Inputs.JobTaskSqlTaskGetArgs>? SqlTask { get; set; }

        [Input("taskKey")]
        public Input<string>? TaskKey { get; set; }

        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        public JobTaskGetArgs()
        {
        }
        public static new JobTaskGetArgs Empty => new JobTaskGetArgs();
    }
}
