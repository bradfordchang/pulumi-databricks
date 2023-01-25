// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntitlementsState extends com.pulumi.resources.ResourceArgs {

    public static final EntitlementsState Empty = new EntitlementsState();

    /**
     * Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    @Import(name="allowClusterCreate")
    private @Nullable Output<Boolean> allowClusterCreate;

    /**
     * @return Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    public Optional<Output<Boolean>> allowClusterCreate() {
        return Optional.ofNullable(this.allowClusterCreate);
    }

    /**
     * Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Import(name="allowInstancePoolCreate")
    private @Nullable Output<Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Optional<Output<Boolean>> allowInstancePoolCreate() {
        return Optional.ofNullable(this.allowInstancePoolCreate);
    }

    /**
     * This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    @Import(name="databricksSqlAccess")
    private @Nullable Output<Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    public Optional<Output<Boolean>> databricksSqlAccess() {
        return Optional.ofNullable(this.databricksSqlAccess);
    }

    /**
     * Canonical unique identifier for the group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Canonical unique identifier for the group.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Canonical unique identifier for the service principal.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<String> servicePrincipalId;

    /**
     * @return Canonical unique identifier for the service principal.
     * 
     */
    public Optional<Output<String>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * Canonical unique identifier for the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return Canonical unique identifier for the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * This is a field to allow the principal to have access to Databricks Workspace.
     * 
     */
    @Import(name="workspaceAccess")
    private @Nullable Output<Boolean> workspaceAccess;

    /**
     * @return This is a field to allow the principal to have access to Databricks Workspace.
     * 
     */
    public Optional<Output<Boolean>> workspaceAccess() {
        return Optional.ofNullable(this.workspaceAccess);
    }

    private EntitlementsState() {}

    private EntitlementsState(EntitlementsState $) {
        this.allowClusterCreate = $.allowClusterCreate;
        this.allowInstancePoolCreate = $.allowInstancePoolCreate;
        this.databricksSqlAccess = $.databricksSqlAccess;
        this.groupId = $.groupId;
        this.servicePrincipalId = $.servicePrincipalId;
        this.userId = $.userId;
        this.workspaceAccess = $.workspaceAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntitlementsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntitlementsState $;

        public Builder() {
            $ = new EntitlementsState();
        }

        public Builder(EntitlementsState defaults) {
            $ = new EntitlementsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowClusterCreate Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(@Nullable Output<Boolean> allowClusterCreate) {
            $.allowClusterCreate = allowClusterCreate;
            return this;
        }

        /**
         * @param allowClusterCreate Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(Boolean allowClusterCreate) {
            return allowClusterCreate(Output.of(allowClusterCreate));
        }

        /**
         * @param allowInstancePoolCreate Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(@Nullable Output<Boolean> allowInstancePoolCreate) {
            $.allowInstancePoolCreate = allowInstancePoolCreate;
            return this;
        }

        /**
         * @param allowInstancePoolCreate Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(Boolean allowInstancePoolCreate) {
            return allowInstancePoolCreate(Output.of(allowInstancePoolCreate));
        }

        /**
         * @param databricksSqlAccess This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
         * 
         * @return builder
         * 
         */
        public Builder databricksSqlAccess(@Nullable Output<Boolean> databricksSqlAccess) {
            $.databricksSqlAccess = databricksSqlAccess;
            return this;
        }

        /**
         * @param databricksSqlAccess This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
         * 
         * @return builder
         * 
         */
        public Builder databricksSqlAccess(Boolean databricksSqlAccess) {
            return databricksSqlAccess(Output.of(databricksSqlAccess));
        }

        /**
         * @param groupId Canonical unique identifier for the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Canonical unique identifier for the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param servicePrincipalId Canonical unique identifier for the service principal.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId Canonical unique identifier for the service principal.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param userId Canonical unique identifier for the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Canonical unique identifier for the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param workspaceAccess This is a field to allow the principal to have access to Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceAccess(@Nullable Output<Boolean> workspaceAccess) {
            $.workspaceAccess = workspaceAccess;
            return this;
        }

        /**
         * @param workspaceAccess This is a field to allow the principal to have access to Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceAccess(Boolean workspaceAccess) {
            return workspaceAccess(Output.of(workspaceAccess));
        }

        public EntitlementsState build() {
            return $;
        }
    }

}
