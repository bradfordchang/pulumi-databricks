// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlAlertOptionsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlAlertState extends com.pulumi.resources.ResourceArgs {

    public static final SqlAlertState Empty = new SqlAlertState();

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Name of the alert.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the alert.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Alert configuration options.
     * 
     */
    @Import(name="options")
    private @Nullable Output<SqlAlertOptionsArgs> options;

    /**
     * @return Alert configuration options.
     * 
     */
    public Optional<Output<SqlAlertOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The identifier of the workspace folder containing the alert. The default is ther user&#39;s home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The identifier of the workspace folder containing the alert. The default is ther user&#39;s home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * ID of the query evaluated by the alert.
     * 
     */
    @Import(name="queryId")
    private @Nullable Output<String> queryId;

    /**
     * @return ID of the query evaluated by the alert.
     * 
     */
    public Optional<Output<String>> queryId() {
        return Optional.ofNullable(this.queryId);
    }

    /**
     * Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
     * 
     */
    @Import(name="rearm")
    private @Nullable Output<Integer> rearm;

    /**
     * @return Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
     * 
     */
    public Optional<Output<Integer>> rearm() {
        return Optional.ofNullable(this.rearm);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private SqlAlertState() {}

    private SqlAlertState(SqlAlertState $) {
        this.createdAt = $.createdAt;
        this.name = $.name;
        this.options = $.options;
        this.parent = $.parent;
        this.queryId = $.queryId;
        this.rearm = $.rearm;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlAlertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlAlertState $;

        public Builder() {
            $ = new SqlAlertState();
        }

        public Builder(SqlAlertState defaults) {
            $ = new SqlAlertState(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param name Name of the alert.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the alert.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Alert configuration options.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<SqlAlertOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Alert configuration options.
         * 
         * @return builder
         * 
         */
        public Builder options(SqlAlertOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param parent The identifier of the workspace folder containing the alert. The default is ther user&#39;s home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The identifier of the workspace folder containing the alert. The default is ther user&#39;s home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param queryId ID of the query evaluated by the alert.
         * 
         * @return builder
         * 
         */
        public Builder queryId(@Nullable Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        /**
         * @param queryId ID of the query evaluated by the alert.
         * 
         * @return builder
         * 
         */
        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        /**
         * @param rearm Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
         * 
         * @return builder
         * 
         */
        public Builder rearm(@Nullable Output<Integer> rearm) {
            $.rearm = rearm;
            return this;
        }

        /**
         * @param rearm Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
         * 
         * @return builder
         * 
         */
        public Builder rearm(Integer rearm) {
            return rearm(Output.of(rearm));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public SqlAlertState build() {
            return $;
        }
    }

}
