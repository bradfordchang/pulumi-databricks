# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GroupRoleArgs', 'GroupRole']

@pulumi.input_type
class GroupRoleArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 role: pulumi.Input[str]):
        """
        The set of arguments for constructing a GroupRole resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] role: This is the AWS role ARN.
        """
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def role(self) -> pulumi.Input[str]:
        """
        This is the AWS role ARN.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[str]):
        pulumi.set(self, "role", value)


@pulumi.input_type
class _GroupRoleState:
    def __init__(__self__, *,
                 group_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GroupRole resources.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] role: This is the AWS role ARN.
        """
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        This is the AWS role ARN.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)


class GroupRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to attach Role ARN (AWS) to databricks_group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        my_group = databricks.Group("myGroup")
        my_group_role = databricks.GroupRole("myGroupRole",
            group_id=my_group.id,
            role="arn:aws:iam::000000000000:role/my-role")
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_aws_bucket_policy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * databricks_group_member to attach users and groups as group members.
        * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] role: This is the AWS role ARN.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to attach Role ARN (AWS) to databricks_group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        my_group = databricks.Group("myGroup")
        my_group_role = databricks.GroupRole("myGroupRole",
            group_id=my_group.id,
            role="arn:aws:iam::000000000000:role/my-role")
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_aws_bucket_policy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * databricks_group_member to attach users and groups as group members.
        * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param GroupRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupRoleArgs.__new__(GroupRoleArgs)

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
        super(GroupRole, __self__).__init__(
            'databricks:index/groupRole:GroupRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None) -> 'GroupRole':
        """
        Get an existing GroupRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] role: This is the AWS role ARN.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupRoleState.__new__(_GroupRoleState)

        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["role"] = role
        return GroupRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[str]:
        """
        This is the AWS role ARN.
        """
        return pulumi.get(self, "role")

