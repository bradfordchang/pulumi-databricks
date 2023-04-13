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
    public sealed class JobTaskSqlTask
    {
        /// <summary>
        /// block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
        /// </summary>
        public readonly Outputs.JobTaskSqlTaskAlert? Alert;
        /// <summary>
        /// block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
        /// </summary>
        public readonly Outputs.JobTaskSqlTaskDashboard? Dashboard;
        /// <summary>
        /// block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
        /// </summary>
        public readonly Outputs.JobTaskSqlTaskFile? File;
        /// <summary>
        /// (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Parameters;
        /// <summary>
        /// block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
        /// </summary>
        public readonly Outputs.JobTaskSqlTaskQuery? Query;
        /// <summary>
        /// ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
        /// </summary>
        public readonly string? WarehouseId;

        [OutputConstructor]
        private JobTaskSqlTask(
            Outputs.JobTaskSqlTaskAlert? alert,

            Outputs.JobTaskSqlTaskDashboard? dashboard,

            Outputs.JobTaskSqlTaskFile? file,

            ImmutableDictionary<string, object>? parameters,

            Outputs.JobTaskSqlTaskQuery? query,

            string? warehouseId)
        {
            Alert = alert;
            Dashboard = dashboard;
            File = file;
            Parameters = parameters;
            Query = query;
            WarehouseId = warehouseId;
        }
    }
}
