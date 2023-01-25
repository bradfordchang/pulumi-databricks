// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("dbtTask")]
        public Inputs.GetJobJobSettingsSettingsDbtTaskArgs? DbtTask { get; set; }

        [Input("emailNotifications")]
        public Inputs.GetJobJobSettingsSettingsEmailNotificationsArgs? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public string? ExistingClusterId { get; set; }

        [Input("format", required: true)]
        public string Format { get; set; } = null!;

        [Input("gitSource")]
        public Inputs.GetJobJobSettingsSettingsGitSourceArgs? GitSource { get; set; }

        [Input("jobClusters")]
        private List<Inputs.GetJobJobSettingsSettingsJobClusterArgs>? _jobClusters;
        public List<Inputs.GetJobJobSettingsSettingsJobClusterArgs> JobClusters
        {
            get => _jobClusters ?? (_jobClusters = new List<Inputs.GetJobJobSettingsSettingsJobClusterArgs>());
            set => _jobClusters = value;
        }

        [Input("libraries")]
        private List<Inputs.GetJobJobSettingsSettingsLibraryArgs>? _libraries;
        public List<Inputs.GetJobJobSettingsSettingsLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new List<Inputs.GetJobJobSettingsSettingsLibraryArgs>());
            set => _libraries = value;
        }

        [Input("maxConcurrentRuns")]
        public int? MaxConcurrentRuns { get; set; }

        [Input("maxRetries")]
        public int? MaxRetries { get; set; }

        [Input("minRetryIntervalMillis")]
        public int? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("newCluster")]
        public Inputs.GetJobJobSettingsSettingsNewClusterArgs? NewCluster { get; set; }

        [Input("notebookTask")]
        public Inputs.GetJobJobSettingsSettingsNotebookTaskArgs? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Inputs.GetJobJobSettingsSettingsPipelineTaskArgs? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Inputs.GetJobJobSettingsSettingsPythonWheelTaskArgs? PythonWheelTask { get; set; }

        [Input("retryOnTimeout")]
        public bool? RetryOnTimeout { get; set; }

        [Input("schedule")]
        public Inputs.GetJobJobSettingsSettingsScheduleArgs? Schedule { get; set; }

        [Input("sparkJarTask")]
        public Inputs.GetJobJobSettingsSettingsSparkJarTaskArgs? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Inputs.GetJobJobSettingsSettingsSparkPythonTaskArgs? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Inputs.GetJobJobSettingsSettingsSparkSubmitTaskArgs? SparkSubmitTask { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        [Input("tasks")]
        private List<Inputs.GetJobJobSettingsSettingsTaskArgs>? _tasks;
        public List<Inputs.GetJobJobSettingsSettingsTaskArgs> Tasks
        {
            get => _tasks ?? (_tasks = new List<Inputs.GetJobJobSettingsSettingsTaskArgs>());
            set => _tasks = value;
        }

        [Input("timeoutSeconds")]
        public int? TimeoutSeconds { get; set; }

        [Input("webhookNotifications")]
        public Inputs.GetJobJobSettingsSettingsWebhookNotificationsArgs? WebhookNotifications { get; set; }

        public GetJobJobSettingsSettingsArgs()
        {
        }
        public static new GetJobJobSettingsSettingsArgs Empty => new GetJobJobSettingsSettingsArgs();
    }
}
