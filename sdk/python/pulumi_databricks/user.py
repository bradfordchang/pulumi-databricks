# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 user_name: pulumi.Input[str],
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 external_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] user_name: This is the username of the given user and will be their form of access and identity.
        :param pulumi.Input[bool] active: Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the username that can be the full name of the user.
        :param pulumi.Input[str] external_id: ID of the user in an external identity provider.
        """
        pulumi.set(__self__, "user_name", user_name)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if external_id is not None:
            pulumi.set(__self__, "external_id", external_id)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        This is the username of the given user and will be their form of access and identity.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is an alias for the username that can be the full name of the user.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user in an external identity provider.
        """
        return pulumi.get(self, "external_id")

    @external_id.setter
    def external_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_id", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 external_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[bool] active: Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the username that can be the full name of the user.
        :param pulumi.Input[str] external_id: ID of the user in an external identity provider.
        :param pulumi.Input[str] user_name: This is the username of the given user and will be their form of access and identity.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if external_id is not None:
            pulumi.set(__self__, "external_id", external_id)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is an alias for the username that can be the full name of the user.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user in an external identity provider.
        """
        return pulumi.get(self, "external_id")

    @external_id.setter
    def external_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_id", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is the username of the given user and will be their form of access and identity.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 external_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        This resource is used to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace. Upon user creation the user will receive a password reset email. You can also get information about caller identity using get_current_user data source.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * databricks_group_member to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User data to retrieves information about databricks_user.

        ## Import

        The resource scim user can be imported using idbash

        ```sh
         $ pulumi import databricks:index/user:User me <user-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the username that can be the full name of the user.
        :param pulumi.Input[str] external_id: ID of the user in an external identity provider.
        :param pulumi.Input[str] user_name: This is the username of the given user and will be their form of access and identity.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource is used to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace. Upon user creation the user will receive a password reset email. You can also get information about caller identity using get_current_user data source.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * databricks_group_member to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User data to retrieves information about databricks_user.

        ## Import

        The resource scim user can be imported using idbash

        ```sh
         $ pulumi import databricks:index/user:User me <user-id>
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 external_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["allow_cluster_create"] = allow_cluster_create
            __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
            __props__.__dict__["databricks_sql_access"] = databricks_sql_access
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["external_id"] = external_id
            __props__.__dict__["force"] = force
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
            __props__.__dict__["workspace_access"] = workspace_access
        super(User, __self__).__init__(
            'databricks:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            allow_cluster_create: Optional[pulumi.Input[bool]] = None,
            allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
            databricks_sql_access: Optional[pulumi.Input[bool]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            external_id: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[bool]] = None,
            user_name: Optional[pulumi.Input[str]] = None,
            workspace_access: Optional[pulumi.Input[bool]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the username that can be the full name of the user.
        :param pulumi.Input[str] external_id: ID of the user in an external identity provider.
        :param pulumi.Input[str] user_name: This is the username of the given user and will be their form of access and identity.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["active"] = active
        __props__.__dict__["allow_cluster_create"] = allow_cluster_create
        __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
        __props__.__dict__["databricks_sql_access"] = databricks_sql_access
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["external_id"] = external_id
        __props__.__dict__["force"] = force
        __props__.__dict__["user_name"] = user_name
        __props__.__dict__["workspace_access"] = workspace_access
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> pulumi.Output[Optional[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        This is an alias for the username that can be the full name of the user.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the user in an external identity provider.
        """
        return pulumi.get(self, "external_id")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        This is the username of the given user and will be their form of access and identity.
        """
        return pulumi.get(self, "user_name")

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "workspace_access")
