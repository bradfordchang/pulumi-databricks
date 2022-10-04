// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("dbtTask")]
        public Inputs.GetJobJobSettingsSettingsTaskDbtTaskArgs? DbtTask { get; set; }

        [Input("dependsOns")]
        private List<Inputs.GetJobJobSettingsSettingsTaskDependsOnArgs>? _dependsOns;
        public List<Inputs.GetJobJobSettingsSettingsTaskDependsOnArgs> DependsOns
        {
            get => _dependsOns ?? (_dependsOns = new List<Inputs.GetJobJobSettingsSettingsTaskDependsOnArgs>());
            set => _dependsOns = value;
        }

        [Input("description")]
        public string? Description { get; set; }

        [Input("emailNotifications")]
        public Inputs.GetJobJobSettingsSettingsTaskEmailNotificationsArgs? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public string? ExistingClusterId { get; set; }

        [Input("jobClusterKey")]
        public string? JobClusterKey { get; set; }

        [Input("libraries")]
        private List<Inputs.GetJobJobSettingsSettingsTaskLibraryArgs>? _libraries;
        public List<Inputs.GetJobJobSettingsSettingsTaskLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new List<Inputs.GetJobJobSettingsSettingsTaskLibraryArgs>());
            set => _libraries = value;
        }

        [Input("maxRetries")]
        public int? MaxRetries { get; set; }

        [Input("minRetryIntervalMillis")]
        public int? MinRetryIntervalMillis { get; set; }

        [Input("newCluster")]
        public Inputs.GetJobJobSettingsSettingsTaskNewClusterArgs? NewCluster { get; set; }

        [Input("notebookTask")]
        public Inputs.GetJobJobSettingsSettingsTaskNotebookTaskArgs? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Inputs.GetJobJobSettingsSettingsTaskPipelineTaskArgs? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Inputs.GetJobJobSettingsSettingsTaskPythonWheelTaskArgs? PythonWheelTask { get; set; }

        [Input("retryOnTimeout", required: true)]
        public bool RetryOnTimeout { get; set; }

        [Input("sparkJarTask")]
        public Inputs.GetJobJobSettingsSettingsTaskSparkJarTaskArgs? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Inputs.GetJobJobSettingsSettingsTaskSparkPythonTaskArgs? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Inputs.GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs? SparkSubmitTask { get; set; }

        [Input("sqlTask")]
        public Inputs.GetJobJobSettingsSettingsTaskSqlTaskArgs? SqlTask { get; set; }

        [Input("taskKey")]
        public string? TaskKey { get; set; }

        [Input("timeoutSeconds")]
        public int? TimeoutSeconds { get; set; }

        public GetJobJobSettingsSettingsTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskArgs Empty => new GetJobJobSettingsSettingsTaskArgs();
    }
}