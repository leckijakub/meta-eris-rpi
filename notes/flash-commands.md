# Flashing

```linux
sudo umount /dev/sda*
sudo bmaptool copy --bmap core-image-base-raspberrypi0-wifi.wic.bmap core-image-base-raspberrypi0-wifi.wic.bz2 /dev/sda
sudo umount /dev/sda*
```

## copy update image

### locally

```linux
sudo cp core-image-base-swu-raspberrypi0-wifi.swu /media/jale/data/
sudo umount /dev/sda*
```

### using ssh

```linux
ssh-keygen -f "/home/jale/.ssh/known_hosts" -R "192.168.0.21"
scp core-image-base-swu-raspberrypi0-wifi.swu root@192.168.0.21:/data/
```

## start update

```rpi
swupdate -e "raspberrypi0-wifi,mmcblk0p3" -i /data/core-image-base-swu-raspberrypi0-wifi.swu -v
```

## connect USBIP

```linux
lsmod
sudo modprobe vhci-hcd
usbip list -r 192.168.0.21
ls /dev/ttyACM*
sudo usbip attach -r 192.168.0.21 -b 1-1
ls /dev/ttyACM*
minicom -D /dev/ttyACM1
```
