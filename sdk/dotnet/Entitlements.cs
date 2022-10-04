// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// This resource allows you to set entitlements to existing databricks_users, databricks.Group or databricks.ServicePrincipal
    /// 
    /// ## Example Usage
    /// 
    /// Setting entitlements for a regular user:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var meUser = Databricks.GetUser.Invoke(new()
    ///     {
    ///         UserName = "me@example.com",
    ///     });
    /// 
    ///     var meEntitlements = new Databricks.Entitlements("meEntitlements", new()
    ///     {
    ///         UserId = meUser.Apply(getUserResult =&gt; getUserResult.Id),
    ///         AllowClusterCreate = true,
    ///         AllowInstancePoolCreate = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Setting entitlements for a service principal:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var thisServicePrincipal = Databricks.GetServicePrincipal.Invoke(new()
    ///     {
    ///         ApplicationId = "11111111-2222-3333-4444-555666777888",
    ///     });
    /// 
    ///     var thisEntitlements = new Databricks.Entitlements("thisEntitlements", new()
    ///     {
    ///         ServicePrincipalId = thisServicePrincipal.Apply(getServicePrincipalResult =&gt; getServicePrincipalResult.SpId),
    ///         AllowClusterCreate = true,
    ///         AllowInstancePoolCreate = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Setting entitlements to all users in a workspace - referencing special `users` databricks.Group
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var users = Databricks.GetGroup.Invoke(new()
    ///     {
    ///         DisplayName = "users",
    ///     });
    /// 
    ///     var workspace_users = new Databricks.Entitlements("workspace-users", new()
    ///     {
    ///         GroupId = users.Apply(getGroupResult =&gt; getGroupResult.Id),
    ///         AllowClusterCreate = true,
    ///         AllowInstancePoolCreate = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
    /// * databricks_group_member to attach users and groups as group members.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.User data to retrieve information about databricks_user.
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `user/user_id` - user `user_id`. * `group/group_id` - group `group_id`. * `spn/spn_id` - service principal `spn_id`. bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/entitlements:Entitlements me user/&lt;user-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/entitlements:Entitlements")]
    public partial class Entitlements : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Output("allowClusterCreate")]
        public Output<bool?> AllowClusterCreate { get; private set; } = null!;

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Output("allowInstancePoolCreate")]
        public Output<bool?> AllowInstancePoolCreate { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Output("databricksSqlAccess")]
        public Output<bool?> DatabricksSqlAccess { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier for the group.
        /// </summary>
        [Output("groupId")]
        public Output<string?> GroupId { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier for the service principal.
        /// </summary>
        [Output("servicePrincipalId")]
        public Output<string?> ServicePrincipalId { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier for the user.
        /// </summary>
        [Output("userId")]
        public Output<string?> UserId { get; private set; } = null!;

        [Output("workspaceAccess")]
        public Output<bool?> WorkspaceAccess { get; private set; } = null!;


        /// <summary>
        /// Create a Entitlements resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Entitlements(string name, EntitlementsArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/entitlements:Entitlements", name, args ?? new EntitlementsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Entitlements(string name, Input<string> id, EntitlementsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/entitlements:Entitlements", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Entitlements resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Entitlements Get(string name, Input<string> id, EntitlementsState? state = null, CustomResourceOptions? options = null)
        {
            return new Entitlements(name, id, state, options);
        }
    }

    public sealed class EntitlementsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// Canonical unique identifier for the group.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// Canonical unique identifier for the service principal.
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        /// <summary>
        /// Canonical unique identifier for the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public EntitlementsArgs()
        {
        }
        public static new EntitlementsArgs Empty => new EntitlementsArgs();
    }

    public sealed class EntitlementsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// Canonical unique identifier for the group.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// Canonical unique identifier for the service principal.
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        /// <summary>
        /// Canonical unique identifier for the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public EntitlementsState()
        {
        }
        public static new EntitlementsState Empty => new EntitlementsState();
    }
}