// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskFileArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskSqlTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskSqlTaskArgs Empty = new JobTaskSqlTaskArgs();

    /**
     * block consisting of following fields:
     * 
     */
    @Import(name="alert")
    private @Nullable Output<JobTaskSqlTaskAlertArgs> alert;

    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<Output<JobTaskSqlTaskAlertArgs>> alert() {
        return Optional.ofNullable(this.alert);
    }

    /**
     * block consisting of following fields:
     * 
     */
    @Import(name="dashboard")
    private @Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard;

    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<Output<JobTaskSqlTaskDashboardArgs>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    /**
     * block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(databricks_sql_query.agg_query().id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(databricks_sql_dashboard.dash().id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(databricks_sql_alert.alert().id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="file")
    private @Nullable Output<JobTaskSqlTaskFileArgs> file;

    /**
     * @return block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(databricks_sql_query.agg_query().id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(databricks_sql_dashboard.dash().id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(databricks_sql_alert.alert().id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<JobTaskSqlTaskFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    @Import(name="query")
    private @Nullable Output<JobTaskSqlTaskQueryArgs> query;

    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    public Optional<Output<JobTaskSqlTaskQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private JobTaskSqlTaskArgs() {}

    private JobTaskSqlTaskArgs(JobTaskSqlTaskArgs $) {
        this.alert = $.alert;
        this.dashboard = $.dashboard;
        this.file = $.file;
        this.parameters = $.parameters;
        this.query = $.query;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskSqlTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskSqlTaskArgs $;

        public Builder() {
            $ = new JobTaskSqlTaskArgs();
        }

        public Builder(JobTaskSqlTaskArgs defaults) {
            $ = new JobTaskSqlTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alert block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder alert(@Nullable Output<JobTaskSqlTaskAlertArgs> alert) {
            $.alert = alert;
            return this;
        }

        /**
         * @param alert block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder alert(JobTaskSqlTaskAlertArgs alert) {
            return alert(Output.of(alert));
        }

        /**
         * @param dashboard block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder dashboard(@Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        /**
         * @param dashboard block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder dashboard(JobTaskSqlTaskDashboardArgs dashboard) {
            return dashboard(Output.of(dashboard));
        }

        /**
         * @param file block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
         *             .tasks(            
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_agg_query&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .query(JobTaskSqlTaskQueryArgs.builder()
         *                             .queryId(databricks_sql_query.agg_query().id())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_dashboard&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
         *                             .dashboardId(databricks_sql_dashboard.dash().id())
         *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
         *                                 .userName(&#34;user@domain.com&#34;)
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_alert&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .alert(JobTaskSqlTaskAlertArgs.builder()
         *                             .alertId(databricks_sql_alert.alert().id())
         *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
         *                                 .userName(&#34;user@domain.com&#34;)
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build())
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<JobTaskSqlTaskFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
         *             .tasks(            
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_agg_query&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .query(JobTaskSqlTaskQueryArgs.builder()
         *                             .queryId(databricks_sql_query.agg_query().id())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_dashboard&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
         *                             .dashboardId(databricks_sql_dashboard.dash().id())
         *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
         *                                 .userName(&#34;user@domain.com&#34;)
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey(&#34;run_alert&#34;)
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
         *                         .alert(JobTaskSqlTaskAlertArgs.builder()
         *                             .alertId(databricks_sql_alert.alert().id())
         *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
         *                                 .userName(&#34;user@domain.com&#34;)
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build())
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder file(JobTaskSqlTaskFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param query block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<JobTaskSqlTaskQueryArgs> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
         * 
         * @return builder
         * 
         */
        public Builder query(JobTaskSqlTaskQueryArgs query) {
            return query(Output.of(query));
        }

        /**
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        /**
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public JobTaskSqlTaskArgs build() {
            return $;
        }
    }

}
