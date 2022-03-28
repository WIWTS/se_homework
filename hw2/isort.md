# 第二次作业
## 卿雨 41911251

## 1.isort包简介

Python的语法要求相较于其他语言来说较为宽松，但良好的格式是减少程序出错和增加可读性的关键。比如，对于import来说，它的内置模块、自定义模块、第三方模块的导入是有一定的顺序的。

isort是针对python的自动规范化的工具包，使用isort其按字母顺序对导入进行排序，并自动将其按部分和类型分开可以迅速按照规则来调整模块导入部分。

![photo_1](./图1.png)

## 2.isort包的使用以及示例
如下是使用isort包之前的python代码示例：

```python
from my_lib import Object

import os

from my_lib import Object3

from my_lib import Object2

import sys

from third_party import lib15, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, lib10, lib11, lib12, lib13, lib14

import sys

from __future__ import absolute_import

from third_party import lib3

print("Hey")
print("yo")
```
运行命令：
- 方法1：指定python文件
```
isort yq.py
```

- 方法2：递归方式
```
isort -rc .
#等价于 isort **/*.py
```

使用isort包之后的效果如下：
```python
from __future__ import absolute_import

import os
import sys

from my_lib import Object, Object2, Object3
from third_party import (lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9,
                         lib10, lib11, lib12, lib13, lib14, lib15)

print("Hey")
print("yo")
```

## 3.结语

代码的规范非常重要，使用isort包可以一定程度上简化我们的工作，帮助我们更好地完成项目。

## 4.参考资料

（1）. [isort](https://pypi.org/project/isort/)