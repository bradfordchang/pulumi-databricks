# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PermissionAssignmentArgs', 'PermissionAssignment']

@pulumi.input_type
class PermissionAssignmentArgs:
    def __init__(__self__, *,
                 permissions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 principal_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a PermissionAssignment resource.
        """
        PermissionAssignmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permissions=permissions,
            principal_id=principal_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             principal_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if permissions is None:
            raise TypeError("Missing 'permissions' argument")
        if principal_id is None and 'principalId' in kwargs:
            principal_id = kwargs['principalId']
        if principal_id is None:
            raise TypeError("Missing 'principal_id' argument")

        _setter("permissions", permissions)
        _setter("principal_id", principal_id)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Input[int]:
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "principal_id", value)


@pulumi.input_type
class _PermissionAssignmentState:
    def __init__(__self__, *,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering PermissionAssignment resources.
        """
        _PermissionAssignmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permissions=permissions,
            principal_id=principal_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             principal_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if principal_id is None and 'principalId' in kwargs:
            principal_id = kwargs['principalId']

        if permissions is not None:
            _setter("permissions", permissions)
        if principal_id is not None:
            _setter("principal_id", principal_id)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "principal_id", value)


class PermissionAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a PermissionAssignment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PermissionAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a PermissionAssignment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param PermissionAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PermissionAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PermissionAssignmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PermissionAssignmentArgs.__new__(PermissionAssignmentArgs)

            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if principal_id is None and not opts.urn:
                raise TypeError("Missing required property 'principal_id'")
            __props__.__dict__["principal_id"] = principal_id
        super(PermissionAssignment, __self__).__init__(
            'databricks:index/permissionAssignment:PermissionAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            principal_id: Optional[pulumi.Input[int]] = None) -> 'PermissionAssignment':
        """
        Get an existing PermissionAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PermissionAssignmentState.__new__(_PermissionAssignmentState)

        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["principal_id"] = principal_id
        return PermissionAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Output[int]:
        return pulumi.get(self, "principal_id")

