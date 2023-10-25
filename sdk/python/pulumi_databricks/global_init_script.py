# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GlobalInitScriptArgs', 'GlobalInitScript']

@pulumi.input_type
class GlobalInitScriptArgs:
    def __init__(__self__, *,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 source: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GlobalInitScript resource.
        :param pulumi.Input[bool] enabled: specifies if the script is enabled for execution, or not
        :param pulumi.Input[str] name: the name of the script.  It should be unique
        :param pulumi.Input[int] position: the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        :param pulumi.Input[str] source: Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        GlobalInitScriptArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content_base64=content_base64,
            enabled=enabled,
            md5=md5,
            name=name,
            position=position,
            source=source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content_base64: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             md5: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             position: Optional[pulumi.Input[int]] = None,
             source: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if content_base64 is None and 'contentBase64' in kwargs:
            content_base64 = kwargs['contentBase64']

        if content_base64 is not None:
            _setter("content_base64", content_base64)
        if enabled is not None:
            _setter("enabled", enabled)
        if md5 is not None:
            _setter("md5", md5)
        if name is not None:
            _setter("name", name)
        if position is not None:
            _setter("position", position)
        if source is not None:
            _setter("source", source)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content_base64")

    @content_base64.setter
    def content_base64(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_base64", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        specifies if the script is enabled for execution, or not
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "md5", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        the name of the script.  It should be unique
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _GlobalInitScriptState:
    def __init__(__self__, *,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 source: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GlobalInitScript resources.
        :param pulumi.Input[bool] enabled: specifies if the script is enabled for execution, or not
        :param pulumi.Input[str] name: the name of the script.  It should be unique
        :param pulumi.Input[int] position: the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        :param pulumi.Input[str] source: Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        _GlobalInitScriptState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content_base64=content_base64,
            enabled=enabled,
            md5=md5,
            name=name,
            position=position,
            source=source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content_base64: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             md5: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             position: Optional[pulumi.Input[int]] = None,
             source: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if content_base64 is None and 'contentBase64' in kwargs:
            content_base64 = kwargs['contentBase64']

        if content_base64 is not None:
            _setter("content_base64", content_base64)
        if enabled is not None:
            _setter("enabled", enabled)
        if md5 is not None:
            _setter("md5", md5)
        if name is not None:
            _setter("name", name)
        if position is not None:
            _setter("position", position)
        if source is not None:
            _setter("source", source)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content_base64")

    @content_base64.setter
    def content_base64(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_base64", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        specifies if the script is enabled for execution, or not
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "md5", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        the name of the script.  It should be unique
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)


class GlobalInitScript(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        The resource global init script can be imported using script IDbash

        ```sh
         $ pulumi import databricks:index/globalInitScript:GlobalInitScript this script_id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: specifies if the script is enabled for execution, or not
        :param pulumi.Input[str] name: the name of the script.  It should be unique
        :param pulumi.Input[int] position: the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        :param pulumi.Input[str] source: Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GlobalInitScriptArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        The resource global init script can be imported using script IDbash

        ```sh
         $ pulumi import databricks:index/globalInitScript:GlobalInitScript this script_id
        ```

        :param str resource_name: The name of the resource.
        :param GlobalInitScriptArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalInitScriptArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            GlobalInitScriptArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_base64: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 md5: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalInitScriptArgs.__new__(GlobalInitScriptArgs)

            __props__.__dict__["content_base64"] = content_base64
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["md5"] = md5
            __props__.__dict__["name"] = name
            __props__.__dict__["position"] = position
            __props__.__dict__["source"] = source
        super(GlobalInitScript, __self__).__init__(
            'databricks:index/globalInitScript:GlobalInitScript',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content_base64: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            md5: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            position: Optional[pulumi.Input[int]] = None,
            source: Optional[pulumi.Input[str]] = None) -> 'GlobalInitScript':
        """
        Get an existing GlobalInitScript resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: specifies if the script is enabled for execution, or not
        :param pulumi.Input[str] name: the name of the script.  It should be unique
        :param pulumi.Input[int] position: the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        :param pulumi.Input[str] source: Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalInitScriptState.__new__(_GlobalInitScriptState)

        __props__.__dict__["content_base64"] = content_base64
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["md5"] = md5
        __props__.__dict__["name"] = name
        __props__.__dict__["position"] = position
        __props__.__dict__["source"] = source
        return GlobalInitScript(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contentBase64")
    def content_base64(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "content_base64")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        specifies if the script is enabled for execution, or not
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def md5(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "md5")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        the name of the script.  It should be unique
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def position(self) -> pulumi.Output[int]:
        """
        the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
        """
        return pulumi.get(self, "position")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[str]]:
        """
        Path to script's source code on local filesystem. Conflicts with `content_base64`
        """
        return pulumi.get(self, "source")

