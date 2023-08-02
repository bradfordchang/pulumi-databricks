// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsResult
    {
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsComputeResult> Computes;
        public readonly Outputs.GetJobJobSettingsSettingsContinuousResult? Continuous;
        public readonly Outputs.GetJobJobSettingsSettingsDbtTaskResult? DbtTask;
        public readonly Outputs.GetJobJobSettingsSettingsEmailNotificationsResult? EmailNotifications;
        public readonly string? ExistingClusterId;
        public readonly string Format;
        public readonly Outputs.GetJobJobSettingsSettingsGitSourceResult? GitSource;
        public readonly Outputs.GetJobJobSettingsSettingsHealthResult? Health;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterResult> JobClusters;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsLibraryResult> Libraries;
        public readonly int? MaxConcurrentRuns;
        public readonly int? MaxRetries;
        public readonly int? MinRetryIntervalMillis;
        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        public readonly string? Name;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterResult? NewCluster;
        public readonly Outputs.GetJobJobSettingsSettingsNotebookTaskResult? NotebookTask;
        public readonly Outputs.GetJobJobSettingsSettingsNotificationSettingsResult? NotificationSettings;
        public readonly Outputs.GetJobJobSettingsSettingsPipelineTaskResult? PipelineTask;
        public readonly Outputs.GetJobJobSettingsSettingsPythonWheelTaskResult? PythonWheelTask;
        public readonly Outputs.GetJobJobSettingsSettingsQueueResult? Queue;
        public readonly bool? RetryOnTimeout;
        public readonly Outputs.GetJobJobSettingsSettingsRunAsResult? RunAs;
        public readonly Outputs.GetJobJobSettingsSettingsScheduleResult? Schedule;
        public readonly Outputs.GetJobJobSettingsSettingsSparkJarTaskResult? SparkJarTask;
        public readonly Outputs.GetJobJobSettingsSettingsSparkPythonTaskResult? SparkPythonTask;
        public readonly Outputs.GetJobJobSettingsSettingsSparkSubmitTaskResult? SparkSubmitTask;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskResult> Tasks;
        public readonly int? TimeoutSeconds;
        public readonly Outputs.GetJobJobSettingsSettingsTriggerResult? Trigger;
        public readonly Outputs.GetJobJobSettingsSettingsWebhookNotificationsResult? WebhookNotifications;

        [OutputConstructor]
        private GetJobJobSettingsSettingsResult(
            ImmutableArray<Outputs.GetJobJobSettingsSettingsComputeResult> computes,

            Outputs.GetJobJobSettingsSettingsContinuousResult? continuous,

            Outputs.GetJobJobSettingsSettingsDbtTaskResult? dbtTask,

            Outputs.GetJobJobSettingsSettingsEmailNotificationsResult? emailNotifications,

            string? existingClusterId,

            string format,

            Outputs.GetJobJobSettingsSettingsGitSourceResult? gitSource,

            Outputs.GetJobJobSettingsSettingsHealthResult? health,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterResult> jobClusters,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsLibraryResult> libraries,

            int? maxConcurrentRuns,

            int? maxRetries,

            int? minRetryIntervalMillis,

            string? name,

            Outputs.GetJobJobSettingsSettingsNewClusterResult? newCluster,

            Outputs.GetJobJobSettingsSettingsNotebookTaskResult? notebookTask,

            Outputs.GetJobJobSettingsSettingsNotificationSettingsResult? notificationSettings,

            Outputs.GetJobJobSettingsSettingsPipelineTaskResult? pipelineTask,

            Outputs.GetJobJobSettingsSettingsPythonWheelTaskResult? pythonWheelTask,

            Outputs.GetJobJobSettingsSettingsQueueResult? queue,

            bool? retryOnTimeout,

            Outputs.GetJobJobSettingsSettingsRunAsResult? runAs,

            Outputs.GetJobJobSettingsSettingsScheduleResult? schedule,

            Outputs.GetJobJobSettingsSettingsSparkJarTaskResult? sparkJarTask,

            Outputs.GetJobJobSettingsSettingsSparkPythonTaskResult? sparkPythonTask,

            Outputs.GetJobJobSettingsSettingsSparkSubmitTaskResult? sparkSubmitTask,

            ImmutableDictionary<string, object>? tags,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskResult> tasks,

            int? timeoutSeconds,

            Outputs.GetJobJobSettingsSettingsTriggerResult? trigger,

            Outputs.GetJobJobSettingsSettingsWebhookNotificationsResult? webhookNotifications)
        {
            Computes = computes;
            Continuous = continuous;
            DbtTask = dbtTask;
            EmailNotifications = emailNotifications;
            ExistingClusterId = existingClusterId;
            Format = format;
            GitSource = gitSource;
            Health = health;
            JobClusters = jobClusters;
            Libraries = libraries;
            MaxConcurrentRuns = maxConcurrentRuns;
            MaxRetries = maxRetries;
            MinRetryIntervalMillis = minRetryIntervalMillis;
            Name = name;
            NewCluster = newCluster;
            NotebookTask = notebookTask;
            NotificationSettings = notificationSettings;
            PipelineTask = pipelineTask;
            PythonWheelTask = pythonWheelTask;
            Queue = queue;
            RetryOnTimeout = retryOnTimeout;
            RunAs = runAs;
            Schedule = schedule;
            SparkJarTask = sparkJarTask;
            SparkPythonTask = sparkPythonTask;
            SparkSubmitTask = sparkSubmitTask;
            Tags = tags;
            Tasks = tasks;
            TimeoutSeconds = timeoutSeconds;
            Trigger = trigger;
            WebhookNotifications = webhookNotifications;
        }
    }
}
