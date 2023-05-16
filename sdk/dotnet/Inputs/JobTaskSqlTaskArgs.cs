// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskSqlTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
        /// </summary>
        [Input("alert")]
        public Input<Inputs.JobTaskSqlTaskAlertArgs>? Alert { get; set; }

        /// <summary>
        /// block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
        /// </summary>
        [Input("dashboard")]
        public Input<Inputs.JobTaskSqlTaskDashboardArgs>? Dashboard { get; set; }

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
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        [Input("file")]
        public Input<Inputs.JobTaskSqlTaskFileArgs>? File { get; set; }

        [Input("parameters")]
        private InputMap<object>? _parameters;

        /// <summary>
        /// (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
        /// </summary>
        public InputMap<object> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<object>());
            set => _parameters = value;
        }

        /// <summary>
        /// block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
        /// </summary>
        [Input("query")]
        public Input<Inputs.JobTaskSqlTaskQueryArgs>? Query { get; set; }

        /// <summary>
        /// ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
        /// </summary>
        [Input("warehouseId")]
        public Input<string>? WarehouseId { get; set; }

        public JobTaskSqlTaskArgs()
        {
        }
        public static new JobTaskSqlTaskArgs Empty => new JobTaskSqlTaskArgs();
    }
}
