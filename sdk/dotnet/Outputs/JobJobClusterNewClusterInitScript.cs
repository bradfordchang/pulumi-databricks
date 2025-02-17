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
    public sealed class JobJobClusterNewClusterInitScript
    {
        public readonly Outputs.JobJobClusterNewClusterInitScriptAbfss? Abfss;
        public readonly Outputs.JobJobClusterNewClusterInitScriptDbfs? Dbfs;
        /// <summary>
        /// block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
        /// 
        /// Example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sqlAggregationJob = new Databricks.Job("sqlAggregationJob", new()
        ///     {
        ///         Tasks = new[]
        ///         {
        ///             new Databricks.Inputs.JobTaskArgs
        ///             {
        ///                 TaskKey = "run_agg_query",
        ///                 SqlTask = new Databricks.Inputs.JobTaskSqlTaskArgs
        ///                 {
        ///                     WarehouseId = databricks_sql_endpoint.Sql_job_warehouse.Id,
        ///                     Query = new Databricks.Inputs.JobTaskSqlTaskQueryArgs
        ///                     {
        ///                         QueryId = databricks_sql_query.Agg_query.Id,
        ///                     },
        ///                 },
        ///             },
        ///             new Databricks.Inputs.JobTaskArgs
        ///             {
        ///                 TaskKey = "run_dashboard",
        ///                 SqlTask = new Databricks.Inputs.JobTaskSqlTaskArgs
        ///                 {
        ///                     WarehouseId = databricks_sql_endpoint.Sql_job_warehouse.Id,
        ///                     Dashboard = new Databricks.Inputs.JobTaskSqlTaskDashboardArgs
        ///                     {
        ///                         DashboardId = databricks_sql_dashboard.Dash.Id,
        ///                         Subscriptions = new[]
        ///                         {
        ///                             new Databricks.Inputs.JobTaskSqlTaskDashboardSubscriptionArgs
        ///                             {
        ///                                 UserName = "user@domain.com",
        ///                             },
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///             new Databricks.Inputs.JobTaskArgs
        ///             {
        ///                 TaskKey = "run_alert",
        ///                 SqlTask = new Databricks.Inputs.JobTaskSqlTaskArgs
        ///                 {
        ///                     WarehouseId = databricks_sql_endpoint.Sql_job_warehouse.Id,
        ///                     Alert = new Databricks.Inputs.JobTaskSqlTaskAlertArgs
        ///                     {
        ///                         AlertId = databricks_sql_alert.Alert.Id,
        ///                         Subscriptions = new[]
        ///                         {
        ///                             new Databricks.Inputs.JobTaskSqlTaskAlertSubscriptionArgs
        ///                             {
        ///                                 UserName = "user@domain.com",
        ///                             },
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public readonly Outputs.JobJobClusterNewClusterInitScriptFile? File;
        public readonly Outputs.JobJobClusterNewClusterInitScriptGcs? Gcs;
        public readonly Outputs.JobJobClusterNewClusterInitScriptS3? S3;
        public readonly Outputs.JobJobClusterNewClusterInitScriptVolumes? Volumes;
        public readonly Outputs.JobJobClusterNewClusterInitScriptWorkspace? Workspace;

        [OutputConstructor]
        private JobJobClusterNewClusterInitScript(
            Outputs.JobJobClusterNewClusterInitScriptAbfss? abfss,

            Outputs.JobJobClusterNewClusterInitScriptDbfs? dbfs,

            Outputs.JobJobClusterNewClusterInitScriptFile? file,

            Outputs.JobJobClusterNewClusterInitScriptGcs? gcs,

            Outputs.JobJobClusterNewClusterInitScriptS3? s3,

            Outputs.JobJobClusterNewClusterInitScriptVolumes? volumes,

            Outputs.JobJobClusterNewClusterInitScriptWorkspace? workspace)
        {
            Abfss = abfss;
            Dbfs = dbfs;
            File = file;
            Gcs = gcs;
            S3 = s3;
            Volumes = volumes;
            Workspace = workspace;
        }
    }
}
