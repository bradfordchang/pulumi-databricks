// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
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
     * block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
     * 
     */
    @Import(name="alert")
    private @Nullable Output<JobTaskSqlTaskAlertArgs> alert;

    /**
     * @return block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
     * 
     */
    public Optional<Output<JobTaskSqlTaskAlertArgs>> alert() {
        return Optional.ofNullable(this.alert);
    }

    /**
     * block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    @Import(name="dashboard")
    private @Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard;

    /**
     * @return block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    public Optional<Output<JobTaskSqlTaskDashboardArgs>> dashboard() {
        return Optional.ofNullable(this.dashboard);
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
     * ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only serverless warehouses are supported right now.
     * 
     */
    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only serverless warehouses are supported right now.
     * 
     */
    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private JobTaskSqlTaskArgs() {}

    private JobTaskSqlTaskArgs(JobTaskSqlTaskArgs $) {
        this.alert = $.alert;
        this.dashboard = $.dashboard;
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
         * @param alert block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
         * 
         * @return builder
         * 
         */
        public Builder alert(@Nullable Output<JobTaskSqlTaskAlertArgs> alert) {
            $.alert = alert;
            return this;
        }

        /**
         * @param alert block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
         * 
         * @return builder
         * 
         */
        public Builder alert(JobTaskSqlTaskAlertArgs alert) {
            return alert(Output.of(alert));
        }

        /**
         * @param dashboard block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(@Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        /**
         * @param dashboard block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(JobTaskSqlTaskDashboardArgs dashboard) {
            return dashboard(Output.of(dashboard));
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
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only serverless warehouses are supported right now.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        /**
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only serverless warehouses are supported right now.
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