# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OboTokenArgs', 'OboToken']

@pulumi.input_type
class OboTokenArgs:
    def __init__(__self__, *,
                 application_id: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 lifetime_seconds: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a OboToken resource.
        :param pulumi.Input[str] application_id: Application ID of ServicePrincipal to create a PAT token for.
        :param pulumi.Input[str] comment: Comment that describes the purpose of the token.
        :param pulumi.Input[int] lifetime_seconds: The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        """
        OboTokenArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_id=application_id,
            comment=comment,
            lifetime_seconds=lifetime_seconds,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_id: Optional[pulumi.Input[str]] = None,
             comment: Optional[pulumi.Input[str]] = None,
             lifetime_seconds: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if application_id is None and 'applicationId' in kwargs:
            application_id = kwargs['applicationId']
        if application_id is None:
            raise TypeError("Missing 'application_id' argument")
        if lifetime_seconds is None and 'lifetimeSeconds' in kwargs:
            lifetime_seconds = kwargs['lifetimeSeconds']

        _setter("application_id", application_id)
        if comment is not None:
            _setter("comment", comment)
        if lifetime_seconds is not None:
            _setter("lifetime_seconds", lifetime_seconds)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Input[str]:
        """
        Application ID of ServicePrincipal to create a PAT token for.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment that describes the purpose of the token.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="lifetimeSeconds")
    def lifetime_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        """
        return pulumi.get(self, "lifetime_seconds")

    @lifetime_seconds.setter
    def lifetime_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lifetime_seconds", value)


@pulumi.input_type
class _OboTokenState:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 lifetime_seconds: Optional[pulumi.Input[int]] = None,
                 token_value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OboToken resources.
        :param pulumi.Input[str] application_id: Application ID of ServicePrincipal to create a PAT token for.
        :param pulumi.Input[str] comment: Comment that describes the purpose of the token.
        :param pulumi.Input[int] lifetime_seconds: The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        :param pulumi.Input[str] token_value: **Sensitive** value of the newly-created token.
        """
        _OboTokenState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_id=application_id,
            comment=comment,
            lifetime_seconds=lifetime_seconds,
            token_value=token_value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_id: Optional[pulumi.Input[str]] = None,
             comment: Optional[pulumi.Input[str]] = None,
             lifetime_seconds: Optional[pulumi.Input[int]] = None,
             token_value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if application_id is None and 'applicationId' in kwargs:
            application_id = kwargs['applicationId']
        if lifetime_seconds is None and 'lifetimeSeconds' in kwargs:
            lifetime_seconds = kwargs['lifetimeSeconds']
        if token_value is None and 'tokenValue' in kwargs:
            token_value = kwargs['tokenValue']

        if application_id is not None:
            _setter("application_id", application_id)
        if comment is not None:
            _setter("comment", comment)
        if lifetime_seconds is not None:
            _setter("lifetime_seconds", lifetime_seconds)
        if token_value is not None:
            _setter("token_value", token_value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Application ID of ServicePrincipal to create a PAT token for.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment that describes the purpose of the token.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="lifetimeSeconds")
    def lifetime_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        """
        return pulumi.get(self, "lifetime_seconds")

    @lifetime_seconds.setter
    def lifetime_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lifetime_seconds", value)

    @property
    @pulumi.getter(name="tokenValue")
    def token_value(self) -> Optional[pulumi.Input[str]]:
        """
        **Sensitive** value of the newly-created token.
        """
        return pulumi.get(self, "token_value")

    @token_value.setter
    def token_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_value", value)


class OboToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 lifetime_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: Application ID of ServicePrincipal to create a PAT token for.
        :param pulumi.Input[str] comment: Comment that describes the purpose of the token.
        :param pulumi.Input[int] lifetime_seconds: The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OboTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param OboTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OboTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            OboTokenArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 lifetime_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OboTokenArgs.__new__(OboTokenArgs)

            if application_id is None and not opts.urn:
                raise TypeError("Missing required property 'application_id'")
            __props__.__dict__["application_id"] = application_id
            __props__.__dict__["comment"] = comment
            __props__.__dict__["lifetime_seconds"] = lifetime_seconds
            __props__.__dict__["token_value"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["tokenValue"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(OboToken, __self__).__init__(
            'databricks:index/oboToken:OboToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            lifetime_seconds: Optional[pulumi.Input[int]] = None,
            token_value: Optional[pulumi.Input[str]] = None) -> 'OboToken':
        """
        Get an existing OboToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: Application ID of ServicePrincipal to create a PAT token for.
        :param pulumi.Input[str] comment: Comment that describes the purpose of the token.
        :param pulumi.Input[int] lifetime_seconds: The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        :param pulumi.Input[str] token_value: **Sensitive** value of the newly-created token.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OboTokenState.__new__(_OboTokenState)

        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["comment"] = comment
        __props__.__dict__["lifetime_seconds"] = lifetime_seconds
        __props__.__dict__["token_value"] = token_value
        return OboToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        Application ID of ServicePrincipal to create a PAT token for.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment that describes the purpose of the token.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="lifetimeSeconds")
    def lifetime_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
        """
        return pulumi.get(self, "lifetime_seconds")

    @property
    @pulumi.getter(name="tokenValue")
    def token_value(self) -> pulumi.Output[str]:
        """
        **Sensitive** value of the newly-created token.
        """
        return pulumi.get(self, "token_value")

