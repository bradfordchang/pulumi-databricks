// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlQueryParameterArgs;
import com.pulumi.databricks.inputs.SqlQueryScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryState extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryState Empty = new SqlQueryState();

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Data source ID of a SQL warehouse
     * 
     */
    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    /**
     * @return Data source ID of a SQL warehouse
     * 
     */
    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    /**
     * General description that conveys additional information about this query such as usage notes.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return General description that conveys additional information about this query such as usage notes.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The title of this query that appears in list views, widget headings, and on the query page.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of this query that appears in list views, widget headings, and on the query page.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="parameters")
    private @Nullable Output<List<SqlQueryParameterArgs>> parameters;

    public Optional<Output<List<SqlQueryParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The identifier of the workspace folder containing the object.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The identifier of the workspace folder containing the object.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The text of the query to be run.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return The text of the query to be run.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Run as role. Possible values are `viewer`, `owner`.
     * 
     */
    @Import(name="runAsRole")
    private @Nullable Output<String> runAsRole;

    /**
     * @return Run as role. Possible values are `viewer`, `owner`.
     * 
     */
    public Optional<Output<String>> runAsRole() {
        return Optional.ofNullable(this.runAsRole);
    }

    /**
     * @deprecated
     * Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
     * 
     */
    @Deprecated /* Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`. */
    @Import(name="schedule")
    private @Nullable Output<SqlQueryScheduleArgs> schedule;

    /**
     * @deprecated
     * Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
     * 
     */
    @Deprecated /* Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`. */
    public Optional<Output<SqlQueryScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private SqlQueryState() {}

    private SqlQueryState(SqlQueryState $) {
        this.createdAt = $.createdAt;
        this.dataSourceId = $.dataSourceId;
        this.description = $.description;
        this.name = $.name;
        this.parameters = $.parameters;
        this.parent = $.parent;
        this.query = $.query;
        this.runAsRole = $.runAsRole;
        this.schedule = $.schedule;
        this.tags = $.tags;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryState $;

        public Builder() {
            $ = new SqlQueryState();
        }

        public Builder(SqlQueryState defaults) {
            $ = new SqlQueryState(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param dataSourceId Data source ID of a SQL warehouse
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId Data source ID of a SQL warehouse
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param description General description that conveys additional information about this query such as usage notes.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description General description that conveys additional information about this query such as usage notes.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The title of this query that appears in list views, widget headings, and on the query page.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of this query that appears in list views, widget headings, and on the query page.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<List<SqlQueryParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<SqlQueryParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(SqlQueryParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param parent The identifier of the workspace folder containing the object.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The identifier of the workspace folder containing the object.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param query The text of the query to be run.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The text of the query to be run.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param runAsRole Run as role. Possible values are `viewer`, `owner`.
         * 
         * @return builder
         * 
         */
        public Builder runAsRole(@Nullable Output<String> runAsRole) {
            $.runAsRole = runAsRole;
            return this;
        }

        /**
         * @param runAsRole Run as role. Possible values are `viewer`, `owner`.
         * 
         * @return builder
         * 
         */
        public Builder runAsRole(String runAsRole) {
            return runAsRole(Output.of(runAsRole));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
         * 
         */
        @Deprecated /* Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`. */
        public Builder schedule(@Nullable Output<SqlQueryScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
         * 
         */
        @Deprecated /* Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`. */
        public Builder schedule(SqlQueryScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public SqlQueryState build() {
            return $;
        }
    }

}
