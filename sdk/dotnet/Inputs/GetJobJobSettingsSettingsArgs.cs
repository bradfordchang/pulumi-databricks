// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbtTask")]
        public Input<Inputs.GetJobJobSettingsSettingsDbtTaskInputArgs>? DbtTask { get; set; }

        [Input("emailNotifications")]
        public Input<Inputs.GetJobJobSettingsSettingsEmailNotificationsInputArgs>? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        [Input("gitSource")]
        public Input<Inputs.GetJobJobSettingsSettingsGitSourceInputArgs>? GitSource { get; set; }

        [Input("jobClusters")]
        private InputList<Inputs.GetJobJobSettingsSettingsJobClusterInputArgs>? _jobClusters;
        public InputList<Inputs.GetJobJobSettingsSettingsJobClusterInputArgs> JobClusters
        {
            get => _jobClusters ?? (_jobClusters = new InputList<Inputs.GetJobJobSettingsSettingsJobClusterInputArgs>());
            set => _jobClusters = value;
        }

        [Input("libraries")]
        private InputList<Inputs.GetJobJobSettingsSettingsLibraryInputArgs>? _libraries;
        public InputList<Inputs.GetJobJobSettingsSettingsLibraryInputArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.GetJobJobSettingsSettingsLibraryInputArgs>());
            set => _libraries = value;
        }

        [Input("maxConcurrentRuns")]
        public Input<int>? MaxConcurrentRuns { get; set; }

        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("newCluster")]
        public Input<Inputs.GetJobJobSettingsSettingsNewClusterInputArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.GetJobJobSettingsSettingsNotebookTaskInputArgs>? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.GetJobJobSettingsSettingsPipelineTaskInputArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.GetJobJobSettingsSettingsPythonWheelTaskInputArgs>? PythonWheelTask { get; set; }

        [Input("retryOnTimeout")]
        public Input<bool>? RetryOnTimeout { get; set; }

        [Input("schedule")]
        public Input<Inputs.GetJobJobSettingsSettingsScheduleInputArgs>? Schedule { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.GetJobJobSettingsSettingsSparkJarTaskInputArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.GetJobJobSettingsSettingsSparkPythonTaskInputArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.GetJobJobSettingsSettingsSparkSubmitTaskInputArgs>? SparkSubmitTask { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("tasks")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskInputArgs>? _tasks;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskInputArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.GetJobJobSettingsSettingsTaskInputArgs>());
            set => _tasks = value;
        }

        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        [Input("webhookNotifications")]
        public Input<Inputs.GetJobJobSettingsSettingsWebhookNotificationsInputArgs>? WebhookNotifications { get; set; }

        public GetJobJobSettingsSettingsInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsInputArgs Empty => new GetJobJobSettingsSettingsInputArgs();
    }
}
